SUMMARY = "Microsoft Azure ImageSearch Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Image Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-azure-cognitiveservices-search-imagesearch-2.0.0-2.15.noarch.rpm"
RPM_HASH = "d93d71b878f04b9e1968b3fa861e5c658704e643c014f1a37186e0beadb502f7573843f8d2b7348eafd0b7d0acb4b2fab588bff004881496617f1972beef632b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-cognitiveservices-search-imagesearch) \
python311-azure-cognitiveservices-search-imagesearch \
python3dist(azure-cognitiveservices-search-imagesearch)"
RDEPENDS:${PN} += "python(abi) \
python311-azure-cognitiveservices-nspkg \
python311-azure-cognitiveservices-search-nspkg \
python311-azure-common \
python311-azure-nspkg \
python311-msrest"

inherit rpm
