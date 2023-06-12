SUMMARY = "Microsoft Azure Cognitive Services Visual Search Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Visual Search Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python311-azure-cognitiveservices-search-visualsearch-0.2.0-3.11.noarch.rpm"
RPM_HASH = "20a70087c977ab8d687e99856ed42d1b83f1e07f6508057c6574c2c83c604b7615a33744ac4c644769427b9661d154d1ac3a3139c1c20b9038c40f128b36d0ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-cognitiveservices-search-visualsearch) \
python311-azure-cognitiveservices-search-visualsearch \
python3dist(azure-cognitiveservices-search-visualsearch)"
RDEPENDS:${PN} += "python(abi) \
python311-azure-cognitiveservices-nspkg \
python311-azure-cognitiveservices-search-nspkg \
python311-azure-common \
python311-azure-nspkg \
python311-msrest"

inherit rpm
