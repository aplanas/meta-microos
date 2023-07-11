SUMMARY = "Microsoft Azure Cognitive Services Bing Spell Check Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Spellcheck Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-azure-cognitiveservices-language-spellcheck-2.0.0-2.12.noarch.rpm"
RPM_HASH = "aa53f23e374299bfc91302e941cdb76dfedcdabfd4c4bc7b49c83ecead0402f79eb6bd178e2b9bfa0664bc8fd16d55cbb85d435efaaec57a142aa3af2a4e8dc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-cognitiveservices-language-spellcheck \
python310-azure-cognitiveservices-language-spellcheck \
python3dist-azure-cognitiveservices-language-spellcheck"

RDEPENDS:${PN} += "python-abi \
python310-azure-cognitiveservices-language-nspkg \
python310-azure-cognitiveservices-nspkg \
python310-azure-common \
python310-azure-nspkg \
python310-msrest"

inherit rpm
