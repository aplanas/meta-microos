SUMMARY = "Microsoft Azure Purview Account Client Library for Python"
DESCRIPTION = "Azure Purview Account is a fully managed cloud service"
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python310-azure-purview-account-1.0.0b1-1.8.noarch.rpm"
RPM_HASH = "279b05309fe59a6988e97ae759b041c6a7a8516360f3f57e8a0bb206fe56dc1451c68fc23094b9497551ac8ebeaf25cb5603338c61b17b99c9822b6b91256c72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-purview-account \
python3.10dist(azure-purview-account) \
python310-azure-purview-account \
python3dist(azure-purview-account)"

RDEPENDS:${PN} += "python(abi) \
python310-azure-core \
python310-azure-nspkg \
python310-azure-purview-nspkg \
python310-msrest \
python310-six"

inherit rpm
