SUMMARY = "Microsoft Azure ai-translation Namespace Package"
DESCRIPTION = "This is the Microsoft Azure ai-translation Services namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.ai namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-ai-translation-nspkg-1.0.0-1.8.noarch.rpm"
RPM_HASH = "fa0ac7b32c8f3c18032c33148983dcf4f4f7e33f6b44237871a04a8795468410dc867863c8c02fdd42819231fea7087309fc89ba7309574a225663533eb85c32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-ai-translation-nspkg \
python3.11dist-azure-ai-translation-nspkg \
python311-azure-ai-translation-nspkg \
python3dist-azure-ai-translation-nspkg"

RDEPENDS:${PN} += "python311-azure-ai-nspkg \
python311-azure-nspkg"

inherit rpm
