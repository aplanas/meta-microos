SUMMARY = "Microsoft Azure Cognitive Services Language namespace package"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Language namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.cognitiveservices.language namespace."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python310-azure-cognitiveservices-language-nspkg-3.0.1-3.9.noarch.rpm"
RPM_HASH = "ebcdcbc19f31e861d191fb051b33658d1ff6882f461f459f51401bf3ed804c9aaee4dceb132e9a96f77a8f7c7019bc142e33aeb725f17f1c8f85e626ff2be4d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-language-nspkg \
python3.10dist(azure-cognitiveservices-language-nspkg) \
python310-azure-cognitiveservices-language-nspkg \
python3dist(azure-cognitiveservices-language-nspkg)"
RDEPENDS:${PN} += "python310-azure-cognitiveservices-nspkg \
python310-azure-nspkg"

inherit rpm
