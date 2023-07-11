SUMMARY = "Microsoft Azure Purview Account Client Library for Python"
DESCRIPTION = "Azure Purview Account is a fully managed cloud service"
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python310-azure-purview-account-1.0.0b1-1.10.noarch.rpm"
RPM_HASH = "58d0144c0537a28d9779be25c0c0c9cbd56fd6302a90f5167d25c75aeac8ef1a6321f5781ad6ff8c050c8f3bfad50c0aa80fdcfb7fa0d8b6b48ccedc2bd3b5a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-purview-account \
python310-azure-purview-account \
python3dist-azure-purview-account"

RDEPENDS:${PN} += "python-abi \
python310-azure-core \
python310-azure-nspkg \
python310-azure-purview-nspkg \
python310-msrest \
python310-six"

inherit rpm
