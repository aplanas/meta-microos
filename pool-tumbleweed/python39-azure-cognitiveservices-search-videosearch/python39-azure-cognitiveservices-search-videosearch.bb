SUMMARY = "Microsoft Azure Cognitive Services Video Search Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Video Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-azure-cognitiveservices-search-videosearch-2.0.0-2.12.noarch.rpm"
RPM_HASH = "690d37d831cd8cf8b15267538f54e97b128028097fafa7453445a5de49251ab21ef3b73f6045a49e0e7a060ba3eb59d8e50fc6f6c396e815f428eb37c2a81175"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-cognitiveservices-search-videosearch \
python39-azure-cognitiveservices-search-videosearch \
python3dist-azure-cognitiveservices-search-videosearch"

RDEPENDS:${PN} += "python-abi \
python39-azure-cognitiveservices-nspkg \
python39-azure-cognitiveservices-search-nspkg \
python39-azure-common \
python39-azure-nspkg \
python39-msrest"

inherit rpm
