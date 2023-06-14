SUMMARY = "Microsoft Azure Auto Suggest Client Library"
DESCRIPTION = "This is the Microsoft Azure Auto Suggest Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python39-azure-cognitiveservices-search-autosuggest-0.2.0-2.11.noarch.rpm"
RPM_HASH = "b2b6abda947e43ea2c4a142ba8b973dd96fc445ecfecf4258a336db779343e4238cc37207ebf428f4365a4c7bb14822503c654b46ac0edb3ec238ad3a7a3a5a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-cognitiveservices-search-autosuggest \
python39-azure-cognitiveservices-search-autosuggest \
python3dist-azure-cognitiveservices-search-autosuggest"

RDEPENDS:${PN} += "python-abi \
python39-azure-cognitiveservices-nspkg \
python39-azure-cognitiveservices-search-nspkg \
python39-azure-common \
python39-azure-nspkg \
python39-msrest"

inherit rpm
