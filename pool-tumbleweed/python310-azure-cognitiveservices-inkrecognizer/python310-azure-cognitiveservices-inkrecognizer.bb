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

RPM_NAME = "python310-azure-cognitiveservices-inkrecognizer-1.0.0b1-2.12.noarch.rpm"
RPM_HASH = "5111fa61f09a2a1fa5dc16c0d6b0eb52dc2dd328399bd5d380dcb0314fb823d4d8de9745c6a6b1c2b1c65923de19921a5417d27144937c068f49a5ae436c6e56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-cognitiveservices-inkrecognizer \
python310-azure-cognitiveservices-inkrecognizer \
python3dist-azure-cognitiveservices-inkrecognizer"

RDEPENDS:${PN} += "python-abi \
python310-azure-cognitiveservices-nspkg \
python310-azure-common \
python310-azure-core"

inherit rpm
