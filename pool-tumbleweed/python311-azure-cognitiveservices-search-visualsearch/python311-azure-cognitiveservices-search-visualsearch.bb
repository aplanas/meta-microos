SUMMARY = "Microsoft Azure Cognitive Services Visual Search Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Visual Search Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python311-azure-cognitiveservices-search-visualsearch-0.2.0-3.12.noarch.rpm"
RPM_HASH = "8fa539f73c630b5a169318c7d2fb5de98b495c543080a43534598d84306fa85814ca247cc9661c9dc5f7315b332b8b3477566a2c1d1e589a092c7f4e5ce49e62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-search-visualsearch \
python3.11dist-azure-cognitiveservices-search-visualsearch \
python311-azure-cognitiveservices-search-visualsearch \
python3dist-azure-cognitiveservices-search-visualsearch"

RDEPENDS:${PN} += "python-abi \
python311-azure-cognitiveservices-nspkg \
python311-azure-cognitiveservices-search-nspkg \
python311-azure-common \
python311-azure-nspkg \
python311-msrest"

inherit rpm
