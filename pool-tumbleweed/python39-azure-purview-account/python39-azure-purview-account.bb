SUMMARY = "Microsoft Azure Purview Account Client Library for Python"
DESCRIPTION = "Azure Purview Account is a fully managed cloud service"
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python39-azure-purview-account-1.0.0b1-1.10.noarch.rpm"
RPM_HASH = "7a48265a96b8035bbbe1d3e739b4d0192d3f204427f86d0fe48f5966fc2d4b00ec2fba3fd7567e2c8a06da7ddcfb89b4025814489ef7413b90a4cfb6781a91b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-purview-account \
python39-azure-purview-account \
python3dist-azure-purview-account"

RDEPENDS:${PN} += "python-abi \
python39-azure-core \
python39-azure-nspkg \
python39-azure-purview-nspkg \
python39-msrest \
python39-six"

inherit rpm
