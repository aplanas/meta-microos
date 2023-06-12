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

RPM_NAME = "python39-sh-2.0.4-1.1.noarch.rpm"
RPM_HASH = "7a33325367d0ef92ae489697993e235af0c828494128360473a2a85e1d03f11b0c37e8be23b5878418b069a452c1b4cd93f8132f2c82f19e33ccb8dbe5483b1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sh) \
python39-sh \
python3dist(sh)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
