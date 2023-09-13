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

RPM_NAME = "python39-sh-2.0.6-1.1.noarch.rpm"
RPM_HASH = "866ff39ba536edd53cc770d047602b04a22d6e785dd894aa9bb74144f6b313473e756cf23d90b2432dcbd3a116bd8b456d4d38c480171636098d083290c36b3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sh \
python39-sh \
python3dist-sh"

RDEPENDS:${PN} += "python-abi"

inherit rpm
