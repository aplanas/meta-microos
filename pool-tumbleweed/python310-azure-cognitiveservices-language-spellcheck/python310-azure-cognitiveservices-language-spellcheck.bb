SUMMARY = "Microsoft Azure Cognitive Services Bing Spell Check Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Spellcheck Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-azure-cognitiveservices-language-spellcheck-2.0.0-2.11.noarch.rpm"
RPM_HASH = "6561c37cf37a08594a0e2165f969e05d36e2209cf2000a1f5841fda3ebf3681ef25ed06818752447736dacaaf03af5740418a184eef9d8028663048182fde79d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-language-spellcheck \
python3.10dist(azure-cognitiveservices-language-spellcheck) \
python310-azure-cognitiveservices-language-spellcheck \
python3dist(azure-cognitiveservices-language-spellcheck)"

RDEPENDS:${PN} += "python(abi) \
python310-azure-cognitiveservices-language-nspkg \
python310-azure-cognitiveservices-nspkg \
python310-azure-common \
python310-azure-nspkg \
python310-msrest"

inherit rpm
