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

PV = "2.0.4"

RPM_NAME = "python310-sh-2.0.4-1.1.noarch.rpm"
RPM_HASH = "71266796e892d21bb4e58467afd77ede59fe0fa60ecff0aedc5c62fded2f540feb163d0cc824695b95cccc4447389654cbab5a4f73fa6b9577da51569ffe74c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sh \
python3.10dist-sh \
python310-sh \
python3dist-sh"

RDEPENDS:${PN} += "python-abi"

inherit rpm
