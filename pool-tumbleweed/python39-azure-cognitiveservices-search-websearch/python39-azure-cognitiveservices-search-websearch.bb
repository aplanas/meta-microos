SUMMARY = "Microsoft Azure Cognitive Services WebSearch Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Web Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-azure-cognitiveservices-search-websearch-2.0.0-2.11.noarch.rpm"
RPM_HASH = "f9e675e8ab7775230514ecbd0c004fbc38459b0f1a4b422839fdb73482acdbf1b332aab5c1b706f5c3fbbb26af8cc00350c8da243c581b3372e806bb3be0c749"
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
