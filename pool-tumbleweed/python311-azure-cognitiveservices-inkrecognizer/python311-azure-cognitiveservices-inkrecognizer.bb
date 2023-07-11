SUMMARY = "Microsoft Azure Cognitive Services Ink Recognizer Client Library"
DESCRIPTION = "Azure Ink Recognizer SDK is an SDK for developers to work with Azure Ink Recognizer Service. \
The service recognize a collection of ink strokes and return a tree hierarchy of the recognized units, \
such as lines, words, shapes, as well as the handwriting recognition result of the words. \
 \
Features: \
 \
* Connect to Azure Ink Recognizer Service \
* Convert collections of ink strokes into HTTP requests \
* Parse HTTP response into ink recognition units"
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python311-azure-cognitiveservices-inkrecognizer-1.0.0b1-2.12.noarch.rpm"
RPM_HASH = "5786240b591da83c0c554344416fc473bcead9cf38c0921344f84a97d9ca529258218d111792267bd119d834e55b1eb8a1690c4fe31a5323d36323830a8e6ee3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-inkrecognizer \
python3.11dist-azure-cognitiveservices-inkrecognizer \
python311-azure-cognitiveservices-inkrecognizer \
python3dist-azure-cognitiveservices-inkrecognizer"

RDEPENDS:${PN} += "python-abi \
python311-azure-cognitiveservices-nspkg \
python311-azure-common \
python311-azure-core"

inherit rpm
