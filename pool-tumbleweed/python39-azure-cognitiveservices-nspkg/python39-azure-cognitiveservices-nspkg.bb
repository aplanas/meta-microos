SUMMARY = "Microsoft Azure Cognitive Services namespace package"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.cognitiveservices namespace."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python39-azure-cognitiveservices-nspkg-3.0.1-4.3.noarch.rpm"
RPM_HASH = "53c6fa161b43b83013431f66041b2d4e71d22f571ee34fc0bd3250e4a6cc6b3405d84cfd89dd476bb848ef682e30f578b7bb67ad90513142a570502f3e3f5d36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-cognitiveservices-nspkg \
python39-azure-cognitiveservices-nspkg \
python3dist-azure-cognitiveservices-nspkg"

RDEPENDS:${PN} += "python39-azure-nspkg"

inherit rpm
