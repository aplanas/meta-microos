SUMMARY = "API for interacting with the parts of fonts"
DESCRIPTION = "An API for interacting with the parts of fonts during the font development process."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python39-fontParts-0.11.0-1.4.noarch.rpm"
RPM_HASH = "ec52d0c4e72ac8602f8f610eadbed6d3ac5c1d5718a85efbe7134fec23ea5f5c8b8cafb215d86138eeae701e50e62d3ffa3f266b5a7f56061edce7a790cbe7d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-fontparts \
python39-fontParts \
python3dist-fontparts"

RDEPENDS:${PN} += "python-abi \
python39-FontTools \
python39-booleanOperations \
python39-defcon \
python39-fontMath \
python39-fs \
python39-lxml"

inherit rpm
