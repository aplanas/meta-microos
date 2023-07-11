SUMMARY = "Microsoft Azure Cognitive Services Form Recognizer Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Form Recognizer Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python39-azure-cognitiveservices-formrecognizer-0.1.1-2.12.noarch.rpm"
RPM_HASH = "68964cf079aca69548f91c4cb70093f3ba2f61d7c362b4214b54531e7a03d5e6534ec69e7ca79d95f14f247b82d5e28d3f11a71a19af28357fb66f86022caa15"
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
