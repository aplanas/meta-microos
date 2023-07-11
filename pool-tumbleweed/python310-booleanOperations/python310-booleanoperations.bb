SUMMARY = "Boolean operations on paths"
DESCRIPTION = "Boolean operations on paths."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python310-booleanOperations-0.9.0-2.9.noarch.rpm"
RPM_HASH = "17fc1d770cad3a08e3c46983c6faf8f79b6f08f372c6242a4a637488cc5f7448b7e1f65b684ada444ce86cbbd164f5ced16e684f3b6c78d3d34e0294252b4dea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-booleanoperations \
python310-booleanOperations \
python3dist-booleanoperations"

RDEPENDS:${PN} += "python-abi \
python310-FontTools \
python310-pyclipper"

inherit rpm
