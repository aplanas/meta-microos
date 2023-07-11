SUMMARY = "Python module for creating SVG drawings"
DESCRIPTION = "A Python library to create SVG drawings."
LICENSE = "MIT"

PV = "1.4.3"

RPM_NAME = "python311-svgwrite-1.4.3-1.5.noarch.rpm"
RPM_HASH = "7d63e38ab173013d0ef5bedf179b49fdae3d746d6c0890dc66714c97dc1f7085dc44b5297ed316a8b608ab78b9410291ea6283831549fe6c4e95abaf02dc9c30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-svgwrite \
python3.11dist-svgwrite \
python311-svgwrite \
python3dist-svgwrite"

RDEPENDS:${PN} += "python-abi \
python311-pyparsing"

inherit rpm
