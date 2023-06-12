SUMMARY = "Microsoft Azure ai-language Namespace Package"
DESCRIPTION = "This is the Microsoft Azure ai-language Services namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.ai namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-ai-language-nspkg-1.0.0-1.7.noarch.rpm"
RPM_HASH = "32cb4f0e53725239c55a4c6381a1c037746d33b436d7b495e745452b9168a432cd702b7baafeab276a1e9f5720b59dc6dfd9d09cd5989a5e3e2df600d9106eb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-ai-language-nspkg \
python3.10dist(azure-ai-language-nspkg) \
python310-azure-ai-language-nspkg \
python3dist(azure-ai-language-nspkg)"
RDEPENDS:${PN} += "python310-azure-ai-nspkg \
python310-azure-nspkg"

inherit rpm
