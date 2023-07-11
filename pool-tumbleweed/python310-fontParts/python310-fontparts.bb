SUMMARY = "API for interacting with the parts of fonts"
DESCRIPTION = "An API for interacting with the parts of fonts during the font development process."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python310-fontParts-0.11.0-1.4.noarch.rpm"
RPM_HASH = "5d912247a2a024b5116ce20aee38960c2f7643da885b7fc108c1ff19935a6464bd6e0c5c231778653022816d41d58e33546a8d8557c8720f10e1125230f3b52d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-fontparts \
python310-fontParts \
python3dist-fontparts"

RDEPENDS:${PN} += "python-abi \
python310-FontTools \
python310-booleanOperations \
python310-defcon \
python310-fontMath \
python310-fs \
python310-lxml"

inherit rpm
