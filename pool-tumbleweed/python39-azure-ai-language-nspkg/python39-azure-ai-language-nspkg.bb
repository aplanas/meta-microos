SUMMARY = "Microsoft Azure ai-language Namespace Package"
DESCRIPTION = "This is the Microsoft Azure ai-language Services namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.ai namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-ai-language-nspkg-1.0.0-1.8.noarch.rpm"
RPM_HASH = "2ad1ebfa1b255f1ab15d5c7b95b1a779617302e094218cb940d966b78195361fe549e05417b0148e5b87c9650826404e0c70a731ad66c9aa3ad4d6ef7c59b0bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-ai-language-nspkg \
python39-azure-ai-language-nspkg \
python3dist-azure-ai-language-nspkg"

RDEPENDS:${PN} += "python39-azure-ai-nspkg \
python39-azure-nspkg"

inherit rpm
