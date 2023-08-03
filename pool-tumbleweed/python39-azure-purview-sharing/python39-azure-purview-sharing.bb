SUMMARY = "Microsoft Azure Purview Sharing Client Library for Python"
DESCRIPTION = "Microsoft Purview Share is a fully managed cloud service."
LICENSE = "MIT"

PV = "1.0.0~b3"

RPM_NAME = "python39-azure-purview-sharing-1.0.0~b3-1.1.noarch.rpm"
RPM_HASH = "4671d3f7facb50d13e9cb05af276d87396c172e813748e4bae94a4d20d8396306329d7a6654e2d908c2b13cdc023bd1262b5ec28eede981c4f0db3f311c7e72c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-purview-sharing \
python39-azure-purview-sharing \
python3dist-azure-purview-sharing"

RDEPENDS:${PN} += "python-abi \
python39-azure-core \
python39-azure-nspkg \
python39-azure-purview-nspkg \
python39-isodate"

inherit rpm
