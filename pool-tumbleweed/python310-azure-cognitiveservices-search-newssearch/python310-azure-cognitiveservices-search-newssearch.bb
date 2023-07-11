SUMMARY = "Microsoft Azure NewsSearch Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services News Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-azure-cognitiveservices-search-newssearch-2.0.0-2.12.noarch.rpm"
RPM_HASH = "b6d305ac83bbaad48d54505d161ac70d2cd0181cafa8531a291d3c0e5a01a8fe732c2f9bd9ee8b2ed776a7ff56c3ed29e3e2741e51c4c31ff52c446a3ab7b0ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-cognitiveservices-search-newssearch \
python310-azure-cognitiveservices-search-newssearch \
python3dist-azure-cognitiveservices-search-newssearch"

RDEPENDS:${PN} += "python-abi \
python310-azure-cognitiveservices-nspkg \
python310-azure-cognitiveservices-search-nspkg \
python310-azure-common \
python310-azure-nspkg \
python310-msrest"

inherit rpm
