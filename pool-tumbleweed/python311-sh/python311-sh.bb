SUMMARY = "Python subprocess interface"
DESCRIPTION = "sh is a full-fledged subprocess replacement for Python 2.6 - 3.6, PyPy \
and PyPy3 that allows you to call any program as if it were a \
function: \
 \
    from sh import ifconfig \
    print ifconfig('eth0') \
 \
sh is not a collection of system commands implemented in Python."
LICENSE = "MIT"

PV = "2.0.6"

RPM_NAME = "python311-sh-2.0.6-1.1.noarch.rpm"
RPM_HASH = "ef775cce0963d4cb2b4d693524f622cfcf055f071bd1f7d3d745484545925279f635142da30c4c04f7638769907b0d875ee87061e686cd4ac1073141f221735a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sh \
python3.11dist-sh \
python311-sh \
python3dist-sh"

RDEPENDS:${PN} += "python-abi"

inherit rpm
