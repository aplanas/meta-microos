SUMMARY = "API for interacting with the parts of fonts"
DESCRIPTION = "An API for interacting with the parts of fonts during the font development process."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python310-fontParts-0.11.0-1.3.noarch.rpm"
RPM_HASH = "7e0c80a790ab9e536957a006146773cce71825f834680d8defa59ef441d134bc97d6d32f0cbe8ef477d94f47796d7b1664ade9674fe791bb424942ec1b1704f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fontParts \
python3.10dist(fontparts) \
python310-fontParts \
python3dist(fontparts)"

RDEPENDS:${PN} += "python(abi) \
python310-FontTools \
python310-booleanOperations \
python310-defcon \
python310-fontMath \
python310-fs \
python310-lxml"

inherit rpm
