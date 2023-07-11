SUMMARY = "Microsoft Azure Custom Vision Client Library"
DESCRIPTION = "This is the Microsoft Azure Custom Vision Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python39-azure-cognitiveservices-vision-customvision-3.1.0-2.12.noarch.rpm"
RPM_HASH = "2ea41ba1369ebc872981b07d0eb6d47841f24e9988dd5cacece66a7f51c476d895500b06ac94f9d22b0c7b5a437525e11f88a74512f83a58cb9bded01fe13550"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-cognitiveservices-vision-customvision \
python39-azure-cognitiveservices-vision-customvision \
python3dist-azure-cognitiveservices-vision-customvision"

RDEPENDS:${PN} += "python-abi \
python39-azure-cognitiveservices-nspkg \
python39-azure-cognitiveservices-vision-nspkg \
python39-azure-common \
python39-azure-nspkg \
python39-msrest"

inherit rpm
