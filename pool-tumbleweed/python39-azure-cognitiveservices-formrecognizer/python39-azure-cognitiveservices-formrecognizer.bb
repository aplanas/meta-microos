SUMMARY = "Microsoft Azure Cognitive Services Form Recognizer Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Form Recognizer Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python39-azure-cognitiveservices-formrecognizer-0.1.1-2.11.noarch.rpm"
RPM_HASH = "ff5b1c39b866c471769d91794804462b1e610ec7765b4d56c8177f6d04f8ab0ead18329bf57212681f34cea908092bc0c329b8e7519a90dd8c8676290f82e256"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-cognitiveservices-formrecognizer \
python39-azure-cognitiveservices-formrecognizer \
python3dist-azure-cognitiveservices-formrecognizer"

RDEPENDS:${PN} += "python-abi \
python39-azure-cognitiveservices-nspkg \
python39-azure-common \
python39-azure-nspkg \
python39-msrest"

inherit rpm
