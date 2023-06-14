SUMMARY = "Microsoft Azure Cognitive Services Text Analytics Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Text Analytics Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python311-azure-cognitiveservices-language-textanalytics-0.2.1-1.6.noarch.rpm"
RPM_HASH = "21e950911709876bd5d7653e7c9d9c131b57d80f91cacfa647dda840796a64723003d5767c258281db16ab7bb9f4f1ec44a949d522b6c845c5b21b9034166cca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-cognitiveservices-language-textanalytics \
python311-azure-cognitiveservices-language-textanalytics \
python3dist-azure-cognitiveservices-language-textanalytics"

RDEPENDS:${PN} += "python-abi \
python311-azure-cognitiveservices-language-nspkg \
python311-azure-cognitiveservices-nspkg \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-nspkg \
python311-msrest"

inherit rpm
