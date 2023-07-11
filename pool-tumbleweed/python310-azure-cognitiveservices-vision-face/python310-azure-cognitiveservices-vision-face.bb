SUMMARY = "Microsoft Azure Cognitive Services Face Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Face Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python310-azure-cognitiveservices-vision-face-0.6.0-1.9.noarch.rpm"
RPM_HASH = "2972ed054a2ffb21dbd476ea73042f2c56fd22e74e20f549aaf5bda871ebbbd446e0d6f008d428107ceaa707f1ce0e4a277a4deac9cbe53716bff07604a7d6a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-cognitiveservices-vision-face \
python310-azure-cognitiveservices-vision-face \
python3dist-azure-cognitiveservices-vision-face"

RDEPENDS:${PN} += "python-abi \
python310-azure-cognitiveservices-nspkg \
python310-azure-cognitiveservices-vision-nspkg \
python310-azure-common \
python310-azure-nspkg \
python310-msrest"

inherit rpm
