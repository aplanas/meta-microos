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

RPM_NAME = "python311-sh-2.0.4-1.3.noarch.rpm"
RPM_HASH = "3ff3eef4900e7493b12a62d4e690db3c8b9a01f0c41fc6ad07881ac2c4bbee17b32987178344c1ca3735241cfe83626938d880fc3aaf5da4fae4fa03906848bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sh \
python3.11dist-sh \
python311-sh \
python3dist-sh"

RDEPENDS:${PN} += "python-abi"

inherit rpm
