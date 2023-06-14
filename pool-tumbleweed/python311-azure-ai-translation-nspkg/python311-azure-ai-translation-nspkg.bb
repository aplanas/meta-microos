SUMMARY = "Microsoft Azure ai-translation Namespace Package"
DESCRIPTION = "This is the Microsoft Azure ai-translation Services namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.ai namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-ai-translation-nspkg-1.0.0-1.7.noarch.rpm"
RPM_HASH = "ea53b9c5a859872d7df22bee3f24a7a68fadcae53e26e5cd9d3ec7579b178a5b189e8b99f99f82483425e4fbc79d4915716529e145eb3cdb549b4c0a22086647"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-ai-translation-nspkg \
python311-azure-ai-translation-nspkg \
python3dist-azure-ai-translation-nspkg"

RDEPENDS:${PN} += "python311-azure-ai-nspkg \
python311-azure-nspkg"

inherit rpm
