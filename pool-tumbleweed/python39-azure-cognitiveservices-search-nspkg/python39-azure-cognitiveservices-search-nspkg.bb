SUMMARY = "Microsoft Azure Cognitive Services Search namespace package"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Search namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.cognitiveservices.search namespace."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python39-azure-cognitiveservices-search-nspkg-3.0.1-3.10.noarch.rpm"
RPM_HASH = "9e868cff83ed04dbb4484a51d15600e6a21d999874e8013c101970c8ed4a06464ef947902a5983428e567f590f59ceccaeba76b82295b12e6d5817748d554b7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-cognitiveservices-search-nspkg \
python39-azure-cognitiveservices-search-nspkg \
python3dist-azure-cognitiveservices-search-nspkg"

RDEPENDS:${PN} += "python39-azure-cognitiveservices-nspkg \
python39-azure-nspkg"

inherit rpm
