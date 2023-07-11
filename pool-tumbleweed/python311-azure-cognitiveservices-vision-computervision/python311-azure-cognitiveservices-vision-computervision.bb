SUMMARY = "Microsoft Azure Cognitive Services Computer Vision Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Computer Vision Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python311-azure-cognitiveservices-vision-computervision-0.9.0-1.9.noarch.rpm"
RPM_HASH = "98187e43d6227852bbb234ef3710b1e65e65494db4d374c156c06ffd31c1717eb1d5cfe4bfc0f47a70ce680c0533d69b9a89879aae08b2a2bf1cfe29b8d054f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-vision-computervision \
python3.11dist-azure-cognitiveservices-vision-computervision \
python311-azure-cognitiveservices-vision-computervision \
python3dist-azure-cognitiveservices-vision-computervision"

RDEPENDS:${PN} += "python-abi \
python311-azure-cognitiveservices-nspkg \
python311-azure-cognitiveservices-vision-nspkg \
python311-azure-common \
python311-azure-nspkg \
python311-msrest"

inherit rpm
