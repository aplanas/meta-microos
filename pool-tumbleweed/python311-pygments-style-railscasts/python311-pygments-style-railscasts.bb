SUMMARY = "Pygments version of the 'railscasts' vim theme."
DESCRIPTION = "A port of the railscasts color scheme for pygments."
LICENSE = "BSD-3-Clause"

PV = "0.3"

RPM_NAME = "python311-pygments-style-railscasts-0.3-1.17.noarch.rpm"
RPM_HASH = "f682a81ccdd763b1560649f43782601e2573da30e012e5bb285ec4d3b653dc9d3fbc15b46bfa1e2802cb4963e84129366628c651452db3b1726f01a6b3e2b1f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pygments-style-railscasts \
python311-pygments-style-railscasts \
python3dist-pygments-style-railscasts"

RDEPENDS:${PN} += "python-abi \
python311-pygments"

inherit rpm
