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

RPM_NAME = "python311-sh-2.0.4-1.1.noarch.rpm"
RPM_HASH = "91c0ed0745d2e44fc4061c05882724e7821e17b65179d5f2312bd15fa3ee645a8aa2b801af41cecce7a8092e941748ae5be07c59d592634ff483982f151289cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sh) \
python311-sh \
python3dist(sh)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
