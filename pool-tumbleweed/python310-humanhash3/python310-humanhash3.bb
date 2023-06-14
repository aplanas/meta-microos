SUMMARY = "Human-readable representations of digests"
DESCRIPTION = "humanhash provides human-readable representations of digests."
LICENSE = "Unlicense"

PV = "0.0.6"

RPM_NAME = "python310-humanhash3-0.0.6-2.17.noarch.rpm"
RPM_HASH = "21c12bf9dfe2aa20f4f998d73ed9a813ea624b3d38200cb4e03582253cc17a5b2c4aff7b728b7f7eaba78b4742fee841ad25a5c61d8b23c8638f0db4c9ace75f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-humanhash3 \
python3.10dist-humanhash3 \
python310-humanhash3 \
python3dist-humanhash3"

RDEPENDS:${PN} += "python-abi"

inherit rpm
