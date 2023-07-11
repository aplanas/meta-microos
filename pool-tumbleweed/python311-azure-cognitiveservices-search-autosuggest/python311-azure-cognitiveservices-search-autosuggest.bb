SUMMARY = "Microsoft Azure Auto Suggest Client Library"
DESCRIPTION = "This is the Microsoft Azure Auto Suggest Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python311-azure-cognitiveservices-search-autosuggest-0.2.0-2.12.noarch.rpm"
RPM_HASH = "fef578599b2d849cfb4f52ae08e26154c114ca0a9b25a7243b2791a73df2516b5943503a2460fc99a48adaa824c39093d688ce44d1ed3caed7f0c6ce72a79ccb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-search-autosuggest \
python3.11dist-azure-cognitiveservices-search-autosuggest \
python311-azure-cognitiveservices-search-autosuggest \
python3dist-azure-cognitiveservices-search-autosuggest"

RDEPENDS:${PN} += "python-abi \
python311-azure-cognitiveservices-nspkg \
python311-azure-cognitiveservices-search-nspkg \
python311-azure-common \
python311-azure-nspkg \
python311-msrest"

inherit rpm
