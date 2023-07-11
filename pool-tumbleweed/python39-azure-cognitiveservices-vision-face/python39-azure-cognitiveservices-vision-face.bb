SUMMARY = "Microsoft Azure Cognitive Services Face Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Face Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python39-azure-cognitiveservices-vision-face-0.6.0-1.9.noarch.rpm"
RPM_HASH = "bcef6fb2a43b68aa9520123e03676739714fc7a309ca50354efe5feec51b15f409ea9527a9eb2288c220af2c543460eec20057fb5da9ca33e48fa82e03d5e0db"
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
