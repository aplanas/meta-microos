SUMMARY = "Microsoft Azure Cognitive Services Entity Search Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Entity Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-azure-cognitiveservices-search-entitysearch-2.0.0-2.12.noarch.rpm"
RPM_HASH = "ffb36b44105ce759a6b90d7a6bb2be37d68010b652f58e386320cf11e7159969b615568ae5e387aac6d64cae91e5d49b99b80edeefddf0b7b3209d9f1642a2bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-cognitiveservices-search-entitysearch \
python39-azure-cognitiveservices-search-entitysearch \
python3dist-azure-cognitiveservices-search-entitysearch"

RDEPENDS:${PN} += "python-abi \
python39-azure-cognitiveservices-nspkg \
python39-azure-cognitiveservices-search-nspkg \
python39-azure-common \
python39-azure-nspkg \
python39-msrest"

inherit rpm
