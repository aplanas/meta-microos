SUMMARY = "Microsoft Azure Custom Vision Client Library"
DESCRIPTION = "This is the Microsoft Azure Custom Vision Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python311-azure-cognitiveservices-vision-customvision-3.1.0-2.12.noarch.rpm"
RPM_HASH = "7f1b8752c7fee39b013c2e2c2fb35ad5f3d333bea6c64c1a6b9f5a457601ef7599724f50f12925d906d4ec02f353a642108e19f875c1529ccdae0e445cfc80c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-vision-customvision \
python3.11dist-azure-cognitiveservices-vision-customvision \
python311-azure-cognitiveservices-vision-customvision \
python3dist-azure-cognitiveservices-vision-customvision"

RDEPENDS:${PN} += "python-abi \
python311-azure-cognitiveservices-nspkg \
python311-azure-cognitiveservices-vision-nspkg \
python311-azure-common \
python311-azure-nspkg \
python311-msrest"

inherit rpm
