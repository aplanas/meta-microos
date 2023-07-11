SUMMARY = "Microsoft Azure Cognitive Services WebSearch Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Web Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-azure-cognitiveservices-search-websearch-2.0.0-2.12.noarch.rpm"
RPM_HASH = "78fa7fc5da7d9d2a14176c1b11a7f1999e96f22e5aa77e175fe26d6f23d05704e24760d92afeea77564c3d645153000b588f42c6a5a345965cfca544a01fe6ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-cognitiveservices-search-websearch \
python310-azure-cognitiveservices-search-websearch \
python3dist-azure-cognitiveservices-search-websearch"

RDEPENDS:${PN} += "python-abi \
python310-azure-cognitiveservices-nspkg \
python310-azure-cognitiveservices-search-nspkg \
python310-azure-common \
python310-azure-nspkg \
python310-msrest"

inherit rpm
