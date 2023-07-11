SUMMARY = "Microsoft Azure Purview Account Client Library for Python"
DESCRIPTION = "Azure Purview Account is a fully managed cloud service"
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python311-azure-purview-account-1.0.0b1-1.10.noarch.rpm"
RPM_HASH = "dcd40c5ef6ca2b93c23c643a4ff6d7f82018597b6c59b25944e88b5bd2db0da6f81bdef50507ada80111422cf6ac916e133303c6979ae30fdcc67cdfa10f60d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-purview-account \
python3.11dist-azure-purview-account \
python311-azure-purview-account \
python3dist-azure-purview-account"

RDEPENDS:${PN} += "python-abi \
python311-azure-core \
python311-azure-nspkg \
python311-azure-purview-nspkg \
python311-msrest \
python311-six"

inherit rpm
