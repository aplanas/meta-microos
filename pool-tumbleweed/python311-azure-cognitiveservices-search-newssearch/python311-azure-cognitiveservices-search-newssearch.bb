SUMMARY = "Microsoft Azure NewsSearch Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services News Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-azure-cognitiveservices-search-newssearch-2.0.0-2.12.noarch.rpm"
RPM_HASH = "be7ccb7068fb5c3cb7521fe000ba1f219e84c0cfd3881e2eb98a0a26dad11f3e1e2c59300f82d88483333d112d80d40d497e0fec57c89b1afa5edcbd9dfc9aa9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-search-newssearch \
python3.11dist-azure-cognitiveservices-search-newssearch \
python311-azure-cognitiveservices-search-newssearch \
python3dist-azure-cognitiveservices-search-newssearch"

RDEPENDS:${PN} += "python-abi \
python311-azure-cognitiveservices-nspkg \
python311-azure-cognitiveservices-search-nspkg \
python311-azure-common \
python311-azure-nspkg \
python311-msrest"

inherit rpm
