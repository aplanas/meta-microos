SUMMARY = "Microsoft Azure Cognitive Services namespace package"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.cognitiveservices namespace."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python311-azure-cognitiveservices-nspkg-3.0.1-4.4.noarch.rpm"
RPM_HASH = "8a0d6208e0b4e96561d70fbf2509e00b64782732d57524e5092994a6420b7e7699dd44b67e3b1ec6acfa058f05cd41767b5fc26040a893ea34c0c0a5ec6c4d7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-nspkg \
python3.11dist-azure-cognitiveservices-nspkg \
python311-azure-cognitiveservices-nspkg \
python3dist-azure-cognitiveservices-nspkg"

RDEPENDS:${PN} += "python311-azure-nspkg"

inherit rpm
