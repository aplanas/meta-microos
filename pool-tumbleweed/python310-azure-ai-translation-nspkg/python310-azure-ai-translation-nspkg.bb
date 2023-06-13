SUMMARY = "Microsoft Azure ai-translation Namespace Package"
DESCRIPTION = "This is the Microsoft Azure ai-translation Services namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.ai namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-ai-translation-nspkg-1.0.0-1.7.noarch.rpm"
RPM_HASH = "6ba7b6909326d8e84259a80c707e078ab6e1c6e25769691bb043ddae1ac9e09f0d6ce856981be9220374812fd4c107cdbbc0f9591ee16eca32f088ec020dc5f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-ai-translation-nspkg \
python3.10dist(azure-ai-translation-nspkg) \
python310-azure-ai-translation-nspkg \
python3dist(azure-ai-translation-nspkg)"

RDEPENDS:${PN} += "python310-azure-ai-nspkg \
python310-azure-nspkg"

inherit rpm
