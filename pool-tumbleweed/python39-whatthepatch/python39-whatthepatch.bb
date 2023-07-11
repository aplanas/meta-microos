SUMMARY = "A patch parsing and application library"
DESCRIPTION = "A patch parsing and application library."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "python39-whatthepatch-1.0.3-1.6.noarch.rpm"
RPM_HASH = "3ebc01cb410c10dd258130582a69012431818cdfbc8b42b32f662bd57d2977b7b745cc13956403918edd76cffbf9be2f137ea0425148d53a2d81e486b515b71e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-whatthepatch \
python39-whatthepatch \
python3dist-whatthepatch"

RDEPENDS:${PN} += "ed \
patch \
python-abi"

inherit rpm
