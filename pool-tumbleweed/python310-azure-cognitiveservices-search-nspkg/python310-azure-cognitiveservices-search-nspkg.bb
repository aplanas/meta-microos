SUMMARY = "Microsoft Azure Cognitive Services Search namespace package"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Search namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.cognitiveservices.search namespace."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python310-azure-cognitiveservices-search-nspkg-3.0.1-3.9.noarch.rpm"
RPM_HASH = "ad9d617a119c70a914f0eb74c30dfb22f01ffc52a1e666633e4214dc23a2687bb3061e919c0595cf13745acfb9a687edd35bf6f2498ff74d1629c49d5b233b9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-search-nspkg \
python3.10dist-azure-cognitiveservices-search-nspkg \
python310-azure-cognitiveservices-search-nspkg \
python3dist-azure-cognitiveservices-search-nspkg"

RDEPENDS:${PN} += "python310-azure-cognitiveservices-nspkg \
python310-azure-nspkg"

inherit rpm
