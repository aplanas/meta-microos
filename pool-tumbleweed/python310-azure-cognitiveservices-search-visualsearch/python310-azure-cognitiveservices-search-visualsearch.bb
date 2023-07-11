SUMMARY = "Microsoft Azure Cognitive Services Visual Search Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Visual Search Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python310-azure-cognitiveservices-search-visualsearch-0.2.0-3.12.noarch.rpm"
RPM_HASH = "70f894c239ab629b248ae73aa296df247a547ae2af0cdcfc553076c83e32b3fb3ca93a0f8998055338b4af2f6724b28c2a930cae0e195bb0f9e63fd289c41f80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-cognitiveservices-search-visualsearch \
python310-azure-cognitiveservices-search-visualsearch \
python3dist-azure-cognitiveservices-search-visualsearch"

RDEPENDS:${PN} += "python-abi \
python310-azure-cognitiveservices-nspkg \
python310-azure-cognitiveservices-search-nspkg \
python310-azure-common \
python310-azure-nspkg \
python310-msrest"

inherit rpm
