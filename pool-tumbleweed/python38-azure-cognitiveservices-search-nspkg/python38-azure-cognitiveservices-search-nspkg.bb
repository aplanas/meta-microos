SUMMARY = "Microsoft Azure Cognitive Services Search namespace package"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Search namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.cognitiveservices.search namespace."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python38-azure-cognitiveservices-search-nspkg-3.0.1-3.9.noarch.rpm"
RPM_HASH = "23c1936efb96f6b224394c8b1ccadd37e8174a59a557ad84647038e27d5dea0b2b053e1064cd8af4e79d69059bab9e3f1bd52004ea5a0c14067392fdc04fa711"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.8dist(azure-cognitiveservices-search-nspkg) \
python38-azure-cognitiveservices-search-nspkg \
python3dist(azure-cognitiveservices-search-nspkg)"
RDEPENDS:${PN} += "python38-azure-cognitiveservices-nspkg \
python38-azure-nspkg"

inherit rpm
