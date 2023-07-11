SUMMARY = "Microsoft Azure Cognitive Services Custom Search Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Custom Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python311-azure-cognitiveservices-search-customsearch-0.3.0-2.12.noarch.rpm"
RPM_HASH = "17eddd3bee5fbb2ad305f16db0aa91577b568c74137ab0b6493ec4c0c110bf71016e528333cb505e95b21db28421bbd73ed9322dd6835280d32c3f8f093a3871"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-search-customsearch \
python3.11dist-azure-cognitiveservices-search-customsearch \
python311-azure-cognitiveservices-search-customsearch \
python3dist-azure-cognitiveservices-search-customsearch"

RDEPENDS:${PN} += "python-abi \
python311-azure-cognitiveservices-nspkg \
python311-azure-cognitiveservices-search-nspkg \
python311-azure-common \
python311-azure-nspkg \
python311-msrest"

inherit rpm
