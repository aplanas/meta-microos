SUMMARY = "Microsoft Azure Cognitive Services Custom Search Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Custom Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python311-azure-cognitiveservices-search-customsearch-0.3.0-2.11.noarch.rpm"
RPM_HASH = "53c52ccd6fddb592bf5933fe4576f07df6ddd2e2a329ba0b596ed587983fb85ade24567ffcb72ecce221e19972b69de489774a1beb2c04f83a80806252cf38f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-cognitiveservices-search-customsearch) \
python311-azure-cognitiveservices-search-customsearch \
python3dist(azure-cognitiveservices-search-customsearch)"

RDEPENDS:${PN} += "python(abi) \
python311-azure-cognitiveservices-nspkg \
python311-azure-cognitiveservices-search-nspkg \
python311-azure-common \
python311-azure-nspkg \
python311-msrest"

inherit rpm
