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

RPM_NAME = "python39-azure-cognitiveservices-inkrecognizer-1.0.0b1-2.12.noarch.rpm"
RPM_HASH = "0aafdf96030626a8f5336ac6ec1442fe19bf14f9f2052ae4754e12eae584a011e92e2a8517a76c86e2286e2412cd8d7e7f0678b21b5182533ac18e0e23c7c752"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-cognitiveservices-inkrecognizer \
python39-azure-cognitiveservices-inkrecognizer \
python3dist-azure-cognitiveservices-inkrecognizer"

RDEPENDS:${PN} += "python-abi \
python39-azure-cognitiveservices-nspkg \
python39-azure-common \
python39-azure-core"

inherit rpm
