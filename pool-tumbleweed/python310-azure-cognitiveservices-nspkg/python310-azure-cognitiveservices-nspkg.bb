SUMMARY = "Microsoft Azure Cognitive Services namespace package"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.cognitiveservices namespace."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python310-azure-cognitiveservices-nspkg-3.0.1-4.4.noarch.rpm"
RPM_HASH = "4e72846709eeb929725df72860b2abe6ab2e341879215e75d7805db1b51fee2f0e3bb833ceaa59ec258f4c4d9682020b1cbc7c70c3421ea079b111ef1426654c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-cognitiveservices-nspkg \
python310-azure-cognitiveservices-nspkg \
python3dist-azure-cognitiveservices-nspkg"

RDEPENDS:${PN} += "python310-azure-nspkg"

inherit rpm
