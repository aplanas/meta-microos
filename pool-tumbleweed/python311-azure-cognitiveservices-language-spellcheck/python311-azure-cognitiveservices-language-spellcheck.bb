SUMMARY = "Microsoft Azure Cognitive Services Bing Spell Check Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Spellcheck Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-azure-cognitiveservices-language-spellcheck-2.0.0-2.11.noarch.rpm"
RPM_HASH = "500eb6c05ac09794c133d927a996459b56bb3da460f9d66e055d7632d00d84f9abcf95481448c0e1f56c1daeb2734e17c842a2667fe6596244ba76e03a188f2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-cognitiveservices-language-spellcheck) \
python311-azure-cognitiveservices-language-spellcheck \
python3dist(azure-cognitiveservices-language-spellcheck)"

RDEPENDS:${PN} += "python(abi) \
python311-azure-cognitiveservices-language-nspkg \
python311-azure-cognitiveservices-nspkg \
python311-azure-common \
python311-azure-nspkg \
python311-msrest"

inherit rpm
