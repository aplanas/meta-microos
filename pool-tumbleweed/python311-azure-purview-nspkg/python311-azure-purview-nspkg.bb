SUMMARY = "Microsoft Azure Purview Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Purview namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.purview namespace."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-azure-purview-nspkg-2.0.0-1.9.noarch.rpm"
RPM_HASH = "5b5e2a47f7e8a031d4b746b0563dfe9ba373489f1b6a2bb384e893c975c864d64f5d8d2ffc16c71f5a04466fd667b7c82e477aedfbc7da4d001ab73387d4439c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-purview-nspkg \
python3.11dist-azure-purview-nspkg \
python311-azure-purview-nspkg \
python3dist-azure-purview-nspkg"

RDEPENDS:${PN} += "python-abi \
python311-azure-nspkg"

inherit rpm
