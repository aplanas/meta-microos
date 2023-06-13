SUMMARY = "Microsoft Azure Auto Suggest Client Library"
DESCRIPTION = "This is the Microsoft Azure Auto Suggest Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python311-azure-cognitiveservices-search-autosuggest-0.2.0-2.11.noarch.rpm"
RPM_HASH = "6e0290ac0b0b4e9728bb83dae6352e7c41f41983beb6455db67a471d2a613e1c049324075bcb07160f8c627cda3efff4eea9b17fdfc64322ac47af2b71380179"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-cognitiveservices-search-autosuggest) \
python311-azure-cognitiveservices-search-autosuggest \
python3dist(azure-cognitiveservices-search-autosuggest)"

RDEPENDS:${PN} += "python(abi) \
python311-azure-cognitiveservices-nspkg \
python311-azure-cognitiveservices-search-nspkg \
python311-azure-common \
python311-azure-nspkg \
python311-msrest"

inherit rpm
