SUMMARY = "Human-readable representations of digests"
DESCRIPTION = "humanhash provides human-readable representations of digests."
LICENSE = "Unlicense"

PV = "0.0.6"

RPM_NAME = "python310-humanhash3-0.0.6-2.18.noarch.rpm"
RPM_HASH = "4aa95ed8f5fa9a115272688813beb890f7659b272f73107d730803bf84aa80d0fa5647dd359368ae2fe8775a90125865594a5fd7e0911d375ded2d3c2cf25539"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-humanhash3 \
python310-humanhash3 \
python3dist-humanhash3"

RDEPENDS:${PN} += "python-abi"

inherit rpm
