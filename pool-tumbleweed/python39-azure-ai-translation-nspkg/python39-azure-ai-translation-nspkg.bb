SUMMARY = "Microsoft Azure ai-translation Namespace Package"
DESCRIPTION = "This is the Microsoft Azure ai-translation Services namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.ai namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-ai-translation-nspkg-1.0.0-1.7.noarch.rpm"
RPM_HASH = "891decdefc10e8f857b0c88a108c9b54347eeaf622448be7a7b97a07450572eb3fc8905592a06b8b6cf7bb04a039a55f806c12de4252bfcbbbeb93d243d0aec5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-ai-translation-nspkg) \
python39-azure-ai-translation-nspkg \
python3dist(azure-ai-translation-nspkg)"
RDEPENDS:${PN} += "python39-azure-ai-nspkg \
python39-azure-nspkg"

inherit rpm
