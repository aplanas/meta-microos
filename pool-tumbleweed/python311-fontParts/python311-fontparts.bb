SUMMARY = "API for interacting with the parts of fonts"
DESCRIPTION = "An API for interacting with the parts of fonts during the font development process."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python311-fontParts-0.11.0-1.4.noarch.rpm"
RPM_HASH = "12b340ed591edab3e0ab80c6c18d75cba2d46a7d04985f5cc9da78c7788f25de34a7f06b9c09152b9153238dffa5f01be42174c9df72a8ed6fb4d4c7273175cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fontParts \
python3.11dist-fontparts \
python311-fontParts \
python3dist-fontparts"

RDEPENDS:${PN} += "python-abi \
python311-FontTools \
python311-booleanOperations \
python311-defcon \
python311-fontMath \
python311-fs \
python311-lxml"

inherit rpm
