SUMMARY = "Microsoft Azure Cognitive Services Entity Search Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Entity Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-azure-cognitiveservices-search-entitysearch-2.0.0-2.12.noarch.rpm"
RPM_HASH = "c3f227f6039dae5d42cb5edc231c19add951d0be21887ffd98eb8f387b54994534df2ed750c4580863d2c25aeaa4efd99030754bbecb2bef199ab3e77874c004"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-cognitiveservices-search-entitysearch \
python310-azure-cognitiveservices-search-entitysearch \
python3dist-azure-cognitiveservices-search-entitysearch"

RDEPENDS:${PN} += "python-abi \
python310-azure-cognitiveservices-nspkg \
python310-azure-cognitiveservices-search-nspkg \
python310-azure-common \
python310-azure-nspkg \
python310-msrest"

inherit rpm
