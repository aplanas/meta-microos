SUMMARY = "Microsoft Azure Purview Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Purview namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.purview namespace."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-azure-purview-nspkg-2.0.0-1.8.noarch.rpm"
RPM_HASH = "c001d311d4b3c0f77cb3618cdd6c7eba61b117362fac0d2211bbf3e0a1759acb5f6d86304f58098f226a6d45a62b01d1aa7c37771239400c1e6f5245baf90fae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-purview-nspkg \
python311-azure-purview-nspkg \
python3dist-azure-purview-nspkg"

RDEPENDS:${PN} += "python-abi \
python311-azure-nspkg"

inherit rpm
