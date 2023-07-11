SUMMARY = "Microsoft Azure ImageSearch Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Image Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-azure-cognitiveservices-search-imagesearch-2.0.0-2.16.noarch.rpm"
RPM_HASH = "8ddb71c8bd87b5573a12410dd49ce0d3412c49e80118f931a5f5269e42fa15721c18f32676b7aad69195e23ab8b32d7aa0c8ac3d016eea0d292862e9a17e72ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-search-imagesearch \
python3.11dist-azure-cognitiveservices-search-imagesearch \
python311-azure-cognitiveservices-search-imagesearch \
python3dist-azure-cognitiveservices-search-imagesearch"

RDEPENDS:${PN} += "python-abi \
python311-azure-cognitiveservices-nspkg \
python311-azure-cognitiveservices-search-nspkg \
python311-azure-common \
python311-azure-nspkg \
python311-msrest"

inherit rpm
