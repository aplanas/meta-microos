SUMMARY = "Microsoft Azure Purview Administration Client Library for Python"
DESCRIPTION = "Azure Purview is a fully managed cloud service."
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python39-azure-purview-administration-1.0.0b1-1.8.noarch.rpm"
RPM_HASH = "e2bf1b6ce58e150191b54b34c3bcb849b522a0e659a9352f2fe759ef661be3be335d0f7918c84de891f3fa54daf52a00c36a015ea1f26ef191073145a071b66b"
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
