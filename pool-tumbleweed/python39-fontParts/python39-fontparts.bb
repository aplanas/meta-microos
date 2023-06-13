SUMMARY = "API for interacting with the parts of fonts"
DESCRIPTION = "An API for interacting with the parts of fonts during the font development process."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python39-fontParts-0.11.0-1.3.noarch.rpm"
RPM_HASH = "a509b9fb10695f3be8e55fd1921a833be7388823f4a48970e3f964f1a3ff06692122363364217185777b39b05501cf153c56694c4c0944d4db3504deb50b0a74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(fontparts) \
python39-fontParts \
python3dist(fontparts)"

RDEPENDS:${PN} += "python(abi) \
python39-FontTools \
python39-booleanOperations \
python39-defcon \
python39-fontMath \
python39-fs \
python39-lxml"

inherit rpm
