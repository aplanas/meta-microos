SUMMARY = "Microsoft Azure Cognitive Services WebSearch Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Web Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-azure-cognitiveservices-search-websearch-2.0.0-2.12.noarch.rpm"
RPM_HASH = "964fada5534f5540e777038359b2deb83fe9068fd8f906a770ec6aca43cdec2bf8110bd273e02e06470647290da3a52610f4e7f693c348b5a6556b0df368eb39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-cognitiveservices-search-websearch \
python39-azure-cognitiveservices-search-websearch \
python3dist-azure-cognitiveservices-search-websearch"

RDEPENDS:${PN} += "python-abi \
python39-azure-cognitiveservices-nspkg \
python39-azure-cognitiveservices-search-nspkg \
python39-azure-common \
python39-azure-nspkg \
python39-msrest"

inherit rpm
