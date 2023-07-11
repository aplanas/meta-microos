SUMMARY = "Microsoft Azure ai-language Namespace Package"
DESCRIPTION = "This is the Microsoft Azure ai-language Services namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.ai namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-ai-language-nspkg-1.0.0-1.8.noarch.rpm"
RPM_HASH = "9dd2eb1d07c210e917a4c6d7ec722a9fe440ec3a9f3b568a3d3b3f07d401cf1165fe42ca0b492156b77447d65a8e5e6db7aa5964f5620c662828db350500fdc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-ai-language-nspkg \
python310-azure-ai-language-nspkg \
python3dist-azure-ai-language-nspkg"

RDEPENDS:${PN} += "python310-azure-ai-nspkg \
python310-azure-nspkg"

inherit rpm
