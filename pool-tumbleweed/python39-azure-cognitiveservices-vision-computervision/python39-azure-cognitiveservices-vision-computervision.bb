SUMMARY = "Microsoft Azure Cognitive Services Computer Vision Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Computer Vision Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python39-azure-cognitiveservices-vision-computervision-0.9.0-1.9.noarch.rpm"
RPM_HASH = "9c293529a2ce1ad925cfe7dd181c5b2dbd98c4854a81841207ca2dd26f43fabf647db1b03d424dd0f7d85c8defaf01c3fafe1d47f166cfda16376f86f85a8158"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-cognitiveservices-vision-computervision \
python39-azure-cognitiveservices-vision-computervision \
python3dist-azure-cognitiveservices-vision-computervision"

RDEPENDS:${PN} += "python-abi \
python39-azure-cognitiveservices-nspkg \
python39-azure-cognitiveservices-vision-nspkg \
python39-azure-common \
python39-azure-nspkg \
python39-msrest"

inherit rpm
