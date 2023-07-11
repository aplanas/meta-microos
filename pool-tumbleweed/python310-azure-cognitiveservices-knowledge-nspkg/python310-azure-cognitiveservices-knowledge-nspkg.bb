SUMMARY = "Microsoft Azure Cognitive Services Knowledge namespace package"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Knowledge namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.cognitiveservices.knowledge namespace."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python310-azure-cognitiveservices-knowledge-nspkg-3.0.0-4.10.noarch.rpm"
RPM_HASH = "85b725cf66017751c8f03451e5049cbf54f388ff8b559627ece0eda8798f6988a875e9135d56171f5ba0120bf3b1bf497835e61f66166cd64d429a23e81a1004"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-cognitiveservices-knowledge-nspkg \
python310-azure-cognitiveservices-knowledge-nspkg \
python3dist-azure-cognitiveservices-knowledge-nspkg"

RDEPENDS:${PN} += "python310-azure-cognitiveservices-nspkg \
python310-azure-nspkg"

inherit rpm
