SUMMARY = "Microsoft Azure Cognitive Services namespace package"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.cognitiveservices namespace."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python39-azure-cognitiveservices-nspkg-3.0.1-4.4.noarch.rpm"
RPM_HASH = "d53ff58c605df4f40fb5a3766d0febe61ab30860c7420a8387270a5b885b9f5e0e29c167584a85c2b44f6472ac30db11614376c965351e5a283dce3761e2d1ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-cognitiveservices-nspkg \
python39-azure-cognitiveservices-nspkg \
python3dist-azure-cognitiveservices-nspkg"

RDEPENDS:${PN} += "python39-azure-nspkg"

inherit rpm
