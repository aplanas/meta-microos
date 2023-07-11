SUMMARY = "Microsoft Azure Cognitive Services Face Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Face Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python311-azure-cognitiveservices-vision-face-0.6.0-1.9.noarch.rpm"
RPM_HASH = "e53beb3a91ba8048ef14b341381d956a55b0c204915fddfdca20494750747fe924d40b6a8abfff5988f534224dc656954676614e2b4176d5f7932a482ef648f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-vision-face \
python3.11dist-azure-cognitiveservices-vision-face \
python311-azure-cognitiveservices-vision-face \
python3dist-azure-cognitiveservices-vision-face"

RDEPENDS:${PN} += "python-abi \
python311-azure-cognitiveservices-nspkg \
python311-azure-cognitiveservices-vision-nspkg \
python311-azure-common \
python311-azure-nspkg \
python311-msrest"

inherit rpm
