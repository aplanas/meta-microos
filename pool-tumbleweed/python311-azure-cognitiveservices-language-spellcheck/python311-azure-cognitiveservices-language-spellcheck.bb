SUMMARY = "Microsoft Azure Cognitive Services Bing Spell Check Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Spellcheck Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-azure-cognitiveservices-language-spellcheck-2.0.0-2.12.noarch.rpm"
RPM_HASH = "257616223ba63fdaac62dfb6059c2ee349df389877d9a24f680c89fa73779d1daf84015ccdbbf08fd6af645a9b8212587810e33f35969ab8fab6886b640e8fb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-language-spellcheck \
python3.11dist-azure-cognitiveservices-language-spellcheck \
python311-azure-cognitiveservices-language-spellcheck \
python3dist-azure-cognitiveservices-language-spellcheck"

RDEPENDS:${PN} += "python-abi \
python311-azure-cognitiveservices-language-nspkg \
python311-azure-cognitiveservices-nspkg \
python311-azure-common \
python311-azure-nspkg \
python311-msrest"

inherit rpm
