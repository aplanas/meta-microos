SUMMARY = "Microsoft Azure Cognitive Services Custom Image Search Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Custom Image Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python310-azure-cognitiveservices-search-customimagesearch-0.2.0-2.15.noarch.rpm"
RPM_HASH = "2b7f94e72e73fdda7e729bb15238c84cf811bf0dc42b1e18f39634334a8c7c2d2a3ae8a429258b881a233acf6bf7709ff3ce160ea460e7cf6a28ced3b07fb4c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-search-customimagesearch \
python3.10dist-azure-cognitiveservices-search-customimagesearch \
python310-azure-cognitiveservices-search-customimagesearch \
python3dist-azure-cognitiveservices-search-customimagesearch"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-msrest"

inherit rpm
