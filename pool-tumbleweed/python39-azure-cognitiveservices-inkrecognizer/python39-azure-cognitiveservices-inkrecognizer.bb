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

RPM_NAME = "python39-azure-cognitiveservices-inkrecognizer-1.0.0b1-2.11.noarch.rpm"
RPM_HASH = "b7c2fc86047bd35ec49644d60ca827bbfc35c4c316c05c3a162442e911e745060c210026a3b354ceba06272a2f220675ee27624e1744076c4f6e1d2e5a21de9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-cognitiveservices-inkrecognizer) \
python39-azure-cognitiveservices-inkrecognizer \
python3dist(azure-cognitiveservices-inkrecognizer)"
RDEPENDS:${PN} += "python(abi) \
python39-azure-cognitiveservices-nspkg \
python39-azure-common \
python39-azure-core"

inherit rpm
