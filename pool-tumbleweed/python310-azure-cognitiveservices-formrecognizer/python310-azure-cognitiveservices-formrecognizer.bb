SUMMARY = "Microsoft Azure Cognitive Services Form Recognizer Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Form Recognizer Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python310-azure-cognitiveservices-formrecognizer-0.1.1-2.12.noarch.rpm"
RPM_HASH = "ac4554c79f539d437c5217679de2765abd18931eeed775371ddfc72d846eb31ecb25dc4a57b6e9da94d2ad601724d92e4087a8516d26e7e4d2fbe623d27fffbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-cognitiveservices-formrecognizer \
python310-azure-cognitiveservices-formrecognizer \
python3dist-azure-cognitiveservices-formrecognizer"

RDEPENDS:${PN} += "python-abi \
python310-azure-cognitiveservices-nspkg \
python310-azure-common \
python310-azure-nspkg \
python310-msrest"

inherit rpm
