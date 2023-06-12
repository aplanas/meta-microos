SUMMARY = "A Python implementation of the 'Human-friendly HSL' (HSLuv) color model"
DESCRIPTION = "A Python implementation of HUSL (revision 3)."
LICENSE = "MIT"

PV = "4.0.3"

RPM_NAME = "python39-husl-4.0.3-3.17.noarch.rpm"
RPM_HASH = "4b4fc30b4f4de7c3f6a5558c9c5f5f9d8be61acfa3d45d52fcda35f8a3a91912bcd26328295e435787aea2a63af07b22788f625dc6f9e77c221be592b94791e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(husl) \
python39-husl \
python3dist(husl)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
