SUMMARY = "Microsoft Azure ImageSearch Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Image Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-azure-cognitiveservices-search-imagesearch-2.0.0-2.16.noarch.rpm"
RPM_HASH = "92369c78a3aebdbe82e0a9bfda19dda27bd70d9594e4f4f4a1219704c89beb5fe265ab85c1ed26ea5e0428e9ff74294cc1ed18eb989f3823f6f1d4a4e90cc659"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-cognitiveservices-search-imagesearch \
python310-azure-cognitiveservices-search-imagesearch \
python3dist-azure-cognitiveservices-search-imagesearch"

RDEPENDS:${PN} += "python-abi \
python310-azure-cognitiveservices-nspkg \
python310-azure-cognitiveservices-search-nspkg \
python310-azure-common \
python310-azure-nspkg \
python310-msrest"

inherit rpm
