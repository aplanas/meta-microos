SUMMARY = "Microsoft Azure Cognitive Services Video Search Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Video Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-azure-cognitiveservices-search-videosearch-2.0.0-2.12.noarch.rpm"
RPM_HASH = "1496e1544abd1bf19b71011d10535d3f4d162ee2baf6edea94e5be366bf611957dec64312c7c57f8c5b1bd1f6ce9a0392291f404df60ecb9d2953765c9501e4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-cognitiveservices-search-videosearch \
python310-azure-cognitiveservices-search-videosearch \
python3dist-azure-cognitiveservices-search-videosearch"

RDEPENDS:${PN} += "python-abi \
python310-azure-cognitiveservices-nspkg \
python310-azure-cognitiveservices-search-nspkg \
python310-azure-common \
python310-azure-nspkg \
python310-msrest"

inherit rpm
