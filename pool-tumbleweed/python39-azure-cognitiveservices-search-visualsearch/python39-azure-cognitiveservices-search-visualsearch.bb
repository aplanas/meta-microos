SUMMARY = "Microsoft Azure Cognitive Services Visual Search Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Visual Search Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python39-azure-cognitiveservices-search-visualsearch-0.2.0-3.12.noarch.rpm"
RPM_HASH = "37b231dd8fcc148770efd01a88abd87a1c4623a201c45b5f3e4345fe92ceb30e78441142d7cf09db0a5b995b03a90af7f45480fc4d72de084c762ed4a38e2077"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-cognitiveservices-search-visualsearch \
python39-azure-cognitiveservices-search-visualsearch \
python3dist-azure-cognitiveservices-search-visualsearch"

RDEPENDS:${PN} += "python-abi \
python39-azure-cognitiveservices-nspkg \
python39-azure-cognitiveservices-search-nspkg \
python39-azure-common \
python39-azure-nspkg \
python39-msrest"

inherit rpm
