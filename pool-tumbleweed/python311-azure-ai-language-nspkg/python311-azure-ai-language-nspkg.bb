SUMMARY = "Microsoft Azure ai-language Namespace Package"
DESCRIPTION = "This is the Microsoft Azure ai-language Services namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.ai namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-ai-language-nspkg-1.0.0-1.8.noarch.rpm"
RPM_HASH = "6040ee7dfcb026b98e40fb0b4f76e117c8be827940fe08d10c7e221abf873b54b9cb10fec2a57c1fb4fb3f410fab3b4b080906aa34af3307e2cdab863aa088ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-ai-language-nspkg \
python3.11dist-azure-ai-language-nspkg \
python311-azure-ai-language-nspkg \
python3dist-azure-ai-language-nspkg"

RDEPENDS:${PN} += "python311-azure-ai-nspkg \
python311-azure-nspkg"

inherit rpm
