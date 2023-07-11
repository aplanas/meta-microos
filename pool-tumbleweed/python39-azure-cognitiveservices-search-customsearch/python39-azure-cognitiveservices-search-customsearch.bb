SUMMARY = "Microsoft Azure Cognitive Services Custom Search Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Custom Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python39-azure-cognitiveservices-search-customsearch-0.3.0-2.12.noarch.rpm"
RPM_HASH = "b9d83370edee532a256e6d5f1810e8b8ad4f7cf2d6b749afd3891670be1fab90633e5c49a6ab7c64675d164a4d11b87f9609c4b590c8506f31834c845180e64b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-cognitiveservices-search-customsearch \
python39-azure-cognitiveservices-search-customsearch \
python3dist-azure-cognitiveservices-search-customsearch"

RDEPENDS:${PN} += "python-abi \
python39-azure-cognitiveservices-nspkg \
python39-azure-cognitiveservices-search-nspkg \
python39-azure-common \
python39-azure-nspkg \
python39-msrest"

inherit rpm
