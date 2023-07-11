SUMMARY = "Microsoft Azure Cognitive Services Computer Vision Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Computer Vision Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python310-azure-cognitiveservices-vision-computervision-0.9.0-1.9.noarch.rpm"
RPM_HASH = "030d2cc5ac3c4de92a9922d3dad5d298bd0e03e4d0015c64070f3d61da3ff50704a6e679a139b14f50024fe6edfe5918532d6a2dd1edb144adc7cb4b27b3ad05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-cognitiveservices-vision-computervision \
python310-azure-cognitiveservices-vision-computervision \
python3dist-azure-cognitiveservices-vision-computervision"

RDEPENDS:${PN} += "python-abi \
python310-azure-cognitiveservices-nspkg \
python310-azure-cognitiveservices-vision-nspkg \
python310-azure-common \
python310-azure-nspkg \
python310-msrest"

inherit rpm
