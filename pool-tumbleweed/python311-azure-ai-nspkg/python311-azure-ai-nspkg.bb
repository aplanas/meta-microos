SUMMARY = "Microsoft Azure AI namespace package"
DESCRIPTION = "This is the Microsoft Azure AI namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.ai namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-ai-nspkg-1.0.0-3.10.noarch.rpm"
RPM_HASH = "6b1415a460c6bdad4c9a95c220c2c91f26f8d8097de21b231bac391f9c7b70de3fc96a5167eabb5f791457ba84bd163c63c50a5ba04b9b56a73eab5314530a77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-ai-nspkg \
python3.11dist-azure-ai-nspkg \
python311-azure-ai-nspkg \
python3dist-azure-ai-nspkg"

RDEPENDS:${PN} += "python311-azure-nspkg"

inherit rpm
