SUMMARY = "Microsoft Azure Cognitive Services Custom Image Search Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Custom Image Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python310-azure-cognitiveservices-search-customimagesearch-0.2.0-2.16.noarch.rpm"
RPM_HASH = "2b406ae73ae2f01670545041b12804a79467b38a84addc6ef0f0e86e6ff9204a9378b60ecd452508dc78984171adf980988d2205e9b7b0f461c30c2a179aaac8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-cognitiveservices-search-customimagesearch \
python310-azure-cognitiveservices-search-customimagesearch \
python3dist-azure-cognitiveservices-search-customimagesearch"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-msrest"

inherit rpm
