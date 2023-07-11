SUMMARY = "Microsoft Azure Cognitive Services Bing Spell Check Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Spellcheck Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-azure-cognitiveservices-language-spellcheck-2.0.0-2.12.noarch.rpm"
RPM_HASH = "e63a07fff53047781e4cf7fec609a45ba04266386a3f20e3dcbc72304eaf8519963ff7eee37a1ea57661d71aa38e9b2c70b10bb9739c15a9f6e0bcb547be9621"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-cognitiveservices-language-spellcheck \
python39-azure-cognitiveservices-language-spellcheck \
python3dist-azure-cognitiveservices-language-spellcheck"

RDEPENDS:${PN} += "python-abi \
python39-azure-cognitiveservices-language-nspkg \
python39-azure-cognitiveservices-nspkg \
python39-azure-common \
python39-azure-nspkg \
python39-msrest"

inherit rpm
