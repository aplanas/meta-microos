SUMMARY = "Microsoft Azure Purview Administration Client Library for Python"
DESCRIPTION = "Azure Purview is a fully managed cloud service."
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python39-azure-purview-administration-1.0.0b1-1.10.noarch.rpm"
RPM_HASH = "6785c27d8ef5564c5a1a7df5cda406f40ad1c15a6a78e8f233cb4d99bd8f743e5f0f7751708a65f4581b7b462006b9e243a174ec0c67acaa168f8efb45b8199c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-purview-administration \
python39-azure-purview-administration \
python3dist-azure-purview-administration"

RDEPENDS:${PN} += "python-abi \
python39-azure-core \
python39-azure-nspkg \
python39-azure-purview-nspkg \
python39-msrest \
python39-six"

inherit rpm
