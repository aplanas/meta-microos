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

RPM_NAME = "python310-sh-2.0.4-1.3.noarch.rpm"
RPM_HASH = "3b63852a5c733cfc6ae7c1365f311b58a9d74acb287c9e7af94e5de2895e0dbfb16d35dd8d7e8cb3a74100ba46ff14bd3f23e2d9c96234c8128d0b68f391e190"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sh \
python310-sh \
python3dist-sh"

RDEPENDS:${PN} += "python-abi"

inherit rpm
