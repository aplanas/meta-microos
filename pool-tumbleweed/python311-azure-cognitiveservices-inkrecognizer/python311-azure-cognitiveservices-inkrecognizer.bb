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

RPM_NAME = "python311-azure-cognitiveservices-inkrecognizer-1.0.0b1-2.11.noarch.rpm"
RPM_HASH = "39472d9fcd1468ea8f3189cd5d233ba1452ff08f28cebe7b2b4cc235086c933801d1b079613f5ea5259ad22c4f844412e616953710d950ad0682900418d0d1c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-cognitiveservices-inkrecognizer) \
python311-azure-cognitiveservices-inkrecognizer \
python3dist(azure-cognitiveservices-inkrecognizer)"
RDEPENDS:${PN} += "python(abi) \
python311-azure-cognitiveservices-nspkg \
python311-azure-common \
python311-azure-core"

inherit rpm
