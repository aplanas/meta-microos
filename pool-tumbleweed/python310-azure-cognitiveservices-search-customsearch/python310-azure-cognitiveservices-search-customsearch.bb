SUMMARY = "Microsoft Azure Cognitive Services Custom Search Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Custom Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python310-azure-cognitiveservices-search-customsearch-0.3.0-2.12.noarch.rpm"
RPM_HASH = "2eba1374ee8f4d0f230799f54211b2d5cceb6ce704498e91291d3cc7d6813994c5d1ce79fb72ed2bb5db966d9fbd06fec3517377a0edda66d8f9f8781f3590af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-cognitiveservices-search-customsearch \
python310-azure-cognitiveservices-search-customsearch \
python3dist-azure-cognitiveservices-search-customsearch"

RDEPENDS:${PN} += "python-abi \
python310-azure-cognitiveservices-nspkg \
python310-azure-cognitiveservices-search-nspkg \
python310-azure-common \
python310-azure-nspkg \
python310-msrest"

inherit rpm
