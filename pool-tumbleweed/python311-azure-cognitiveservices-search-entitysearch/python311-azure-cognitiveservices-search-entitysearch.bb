SUMMARY = "Microsoft Azure Cognitive Services Entity Search Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Entity Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-azure-cognitiveservices-search-entitysearch-2.0.0-2.11.noarch.rpm"
RPM_HASH = "dfef3e47fa781671af2e98e9e564a6e5c8aa71c5fccb7c587e9ee2151b646b0bfd3d88c45e331ff329ff905d0abf56ee449a88c39b6fedc79404d4083bc47c06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-cognitiveservices-search-entitysearch) \
python311-azure-cognitiveservices-search-entitysearch \
python3dist(azure-cognitiveservices-search-entitysearch)"
RDEPENDS:${PN} += "python(abi) \
python311-azure-cognitiveservices-nspkg \
python311-azure-cognitiveservices-search-nspkg \
python311-azure-common \
python311-azure-nspkg \
python311-msrest"

inherit rpm
