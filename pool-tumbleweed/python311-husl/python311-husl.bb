SUMMARY = "A Python implementation of the 'Human-friendly HSL' (HSLuv) color model"
DESCRIPTION = "A Python implementation of HUSL (revision 3)."
LICENSE = "MIT"

PV = "4.0.3"

RPM_NAME = "python311-husl-4.0.3-3.18.noarch.rpm"
RPM_HASH = "bfe0560d20c563fd844e322677a65acb09cbdb85d1f4dcb9a1fdc06b3802d8f5a00f5764e4a1e642e9eb09b6dafa3a27991a174726c3aa84e5184b71f5898078"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-husl \
python3.11dist-husl \
python311-husl \
python3dist-husl"

RDEPENDS:${PN} += "python-abi"

inherit rpm
