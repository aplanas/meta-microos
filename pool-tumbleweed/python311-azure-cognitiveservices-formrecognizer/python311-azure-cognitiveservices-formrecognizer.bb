SUMMARY = "Microsoft Azure Cognitive Services Form Recognizer Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Form Recognizer Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python311-azure-cognitiveservices-formrecognizer-0.1.1-2.12.noarch.rpm"
RPM_HASH = "f844d231dcbf36340ca4ce866f3dc28bccfaf85661762c2cb1e6c94e9db72b111b5c90df1f6ab74304ff38ed323943e84d0f67a48c8a60dc25006de69b8f5afb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-formrecognizer \
python3.11dist-azure-cognitiveservices-formrecognizer \
python311-azure-cognitiveservices-formrecognizer \
python3dist-azure-cognitiveservices-formrecognizer"

RDEPENDS:${PN} += "python-abi \
python311-azure-cognitiveservices-nspkg \
python311-azure-common \
python311-azure-nspkg \
python311-msrest"

inherit rpm
