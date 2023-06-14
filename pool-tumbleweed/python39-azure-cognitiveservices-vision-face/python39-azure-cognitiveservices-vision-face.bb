SUMMARY = "Microsoft Azure Cognitive Services Face Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Face Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python39-azure-cognitiveservices-vision-face-0.6.0-1.8.noarch.rpm"
RPM_HASH = "249d7e5f52f9643fdc49df086414f9e8a41339a713bca6a26dc50275ba010f03cb356081f75f31446566d53c8f982a2316919eff2086ca83615d60b3e2e208e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-cognitiveservices-vision-face \
python39-azure-cognitiveservices-vision-face \
python3dist-azure-cognitiveservices-vision-face"

RDEPENDS:${PN} += "python-abi \
python39-azure-cognitiveservices-nspkg \
python39-azure-cognitiveservices-vision-nspkg \
python39-azure-common \
python39-azure-nspkg \
python39-msrest"

inherit rpm
