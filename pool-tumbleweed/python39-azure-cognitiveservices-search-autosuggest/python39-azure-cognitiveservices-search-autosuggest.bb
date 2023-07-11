SUMMARY = "Microsoft Azure Auto Suggest Client Library"
DESCRIPTION = "This is the Microsoft Azure Auto Suggest Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python39-azure-cognitiveservices-search-autosuggest-0.2.0-2.12.noarch.rpm"
RPM_HASH = "5ba568c874dd82a605b25c72bd95624c1b1b18405729e6d2cb4cd116c8e3fb97f5167dcf3e18d5cfbdfa3aec1895ac08fd97ab44cd322071c94af0c96b6fb55d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-cognitiveservices-search-autosuggest \
python39-azure-cognitiveservices-search-autosuggest \
python3dist-azure-cognitiveservices-search-autosuggest"

RDEPENDS:${PN} += "python-abi \
python39-azure-cognitiveservices-nspkg \
python39-azure-cognitiveservices-search-nspkg \
python39-azure-common \
python39-azure-nspkg \
python39-msrest"

inherit rpm
