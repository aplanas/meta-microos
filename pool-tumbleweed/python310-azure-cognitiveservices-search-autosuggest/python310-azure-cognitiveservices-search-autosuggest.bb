SUMMARY = "Microsoft Azure Auto Suggest Client Library"
DESCRIPTION = "This is the Microsoft Azure Auto Suggest Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python310-azure-cognitiveservices-search-autosuggest-0.2.0-2.12.noarch.rpm"
RPM_HASH = "29bee9631921546a9ae3b4705da278a60a49addfad3f8993017e082e844ce13da183ccee6028f2b93f923035891039156e213dea948542763dc99d977cfe4db3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-cognitiveservices-search-autosuggest \
python310-azure-cognitiveservices-search-autosuggest \
python3dist-azure-cognitiveservices-search-autosuggest"

RDEPENDS:${PN} += "python-abi \
python310-azure-cognitiveservices-nspkg \
python310-azure-cognitiveservices-search-nspkg \
python310-azure-common \
python310-azure-nspkg \
python310-msrest"

inherit rpm
