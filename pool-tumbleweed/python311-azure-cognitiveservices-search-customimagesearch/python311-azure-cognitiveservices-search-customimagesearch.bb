SUMMARY = "Microsoft Azure Cognitive Services Custom Image Search Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Custom Image Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python311-azure-cognitiveservices-search-customimagesearch-0.2.0-2.16.noarch.rpm"
RPM_HASH = "e24ff1e9581b8a7e6b59db70cf4b31d9abdbab230f59e736963bc7d4a66342c399412cca188da0755056534d50e8011cd89779ee9b24103b64ee87f3bcbc87fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-search-customimagesearch \
python3.11dist-azure-cognitiveservices-search-customimagesearch \
python311-azure-cognitiveservices-search-customimagesearch \
python3dist-azure-cognitiveservices-search-customimagesearch"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-msrest"

inherit rpm
