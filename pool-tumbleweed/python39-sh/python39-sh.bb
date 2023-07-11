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

RPM_NAME = "python39-sh-2.0.4-1.3.noarch.rpm"
RPM_HASH = "b2d1e1201ffa418b141ba8e2291e3bb2a6277ea9fc40c42dcd12e8d51f570a30fbf8fa022e7b70a6170a94cb174755e7683320b5d0ec54708480c330cd138795"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sh \
python39-sh \
python3dist-sh"

RDEPENDS:${PN} += "python-abi"

inherit rpm
