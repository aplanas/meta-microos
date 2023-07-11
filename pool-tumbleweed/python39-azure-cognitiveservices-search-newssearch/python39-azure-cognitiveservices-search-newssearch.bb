SUMMARY = "Microsoft Azure NewsSearch Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services News Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-azure-cognitiveservices-search-newssearch-2.0.0-2.12.noarch.rpm"
RPM_HASH = "85996ed9f2706d09109132c609f92159ffe539f1a93e4e1bb49a6fd0afe6eb56fc6a3febde92401bd6235df077b58f4203034cfcc672a84e7e151c357eb4b59e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-cognitiveservices-search-newssearch \
python39-azure-cognitiveservices-search-newssearch \
python3dist-azure-cognitiveservices-search-newssearch"

RDEPENDS:${PN} += "python-abi \
python39-azure-cognitiveservices-nspkg \
python39-azure-cognitiveservices-search-nspkg \
python39-azure-common \
python39-azure-nspkg \
python39-msrest"

inherit rpm
