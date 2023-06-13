SUMMARY = "Microsoft Azure ai-language Namespace Package"
DESCRIPTION = "This is the Microsoft Azure ai-language Services namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.ai namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-ai-language-nspkg-1.0.0-1.7.noarch.rpm"
RPM_HASH = "f017eb3cca9392e080f268e50533bc00e57b3d4f09b09b21265ce4cbfa5a23281edbadc2488d70a1529c7369f38311e35add09548eb079aa6fb2be573cec2976"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-ai-language-nspkg) \
python39-azure-ai-language-nspkg \
python3dist(azure-ai-language-nspkg)"

RDEPENDS:${PN} += "python39-azure-ai-nspkg \
python39-azure-nspkg"

inherit rpm
