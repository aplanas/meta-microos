SUMMARY = "API for interacting with the parts of fonts"
DESCRIPTION = "An API for interacting with the parts of fonts during the font development process."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python311-fontParts-0.11.0-1.3.noarch.rpm"
RPM_HASH = "e0597d61a01b4609e69b21ba42099ce83d5fc4d351b7f222f30c8315ede1f905628caba583090aa339dd8ce67d18f707be783e9a51d2759f02b46244e27f1603"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(fontparts) \
python311-fontParts \
python3dist(fontparts)"
RDEPENDS:${PN} += "python(abi) \
python311-FontTools \
python311-booleanOperations \
python311-defcon \
python311-fontMath \
python311-fs \
python311-lxml"

inherit rpm
