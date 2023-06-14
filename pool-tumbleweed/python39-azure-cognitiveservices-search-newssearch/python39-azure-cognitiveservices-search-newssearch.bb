SUMMARY = "Microsoft Azure NewsSearch Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services News Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-azure-cognitiveservices-search-newssearch-2.0.0-2.11.noarch.rpm"
RPM_HASH = "8257d3393860305dec33f018ccdac82609e9958839c401d5c394f7d27104923bedeea61a7c686810d814ce4a33829178d26ed594de3a7f103c95d27649a35ea8"
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
