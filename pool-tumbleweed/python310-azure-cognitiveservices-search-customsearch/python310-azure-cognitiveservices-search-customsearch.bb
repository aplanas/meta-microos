SUMMARY = "Microsoft Azure Cognitive Services Custom Search Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Custom Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python310-azure-cognitiveservices-search-customsearch-0.3.0-2.11.noarch.rpm"
RPM_HASH = "01a94aa84616d6de8b8abfdbdfb400a8d73b3b9a25efff3aac296fad6fdf7dae55424127de51d13d992e1434b9bbe0d2d600ccade6e7f10808c75ac6df4874ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-search-customsearch \
python3.10dist(azure-cognitiveservices-search-customsearch) \
python310-azure-cognitiveservices-search-customsearch \
python3dist(azure-cognitiveservices-search-customsearch)"

RDEPENDS:${PN} += "python(abi) \
python310-azure-cognitiveservices-nspkg \
python310-azure-cognitiveservices-search-nspkg \
python310-azure-common \
python310-azure-nspkg \
python310-msrest"

inherit rpm
