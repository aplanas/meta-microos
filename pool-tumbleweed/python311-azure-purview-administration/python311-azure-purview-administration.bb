SUMMARY = "Microsoft Azure Purview Administration Client Library for Python"
DESCRIPTION = "Azure Purview is a fully managed cloud service."
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python311-azure-purview-administration-1.0.0b1-1.10.noarch.rpm"
RPM_HASH = "e4c7a9f40dbc07e1d88ef642405b242d84a013661308516a4e20ab921ce432aca12aac48715db7d3754bc6b3689ebeb780cac7ebc434d7f18fb6224f72292c88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-purview-administration \
python3.11dist-azure-purview-administration \
python311-azure-purview-administration \
python3dist-azure-purview-administration"

RDEPENDS:${PN} += "python-abi \
python311-azure-core \
python311-azure-nspkg \
python311-azure-purview-nspkg \
python311-msrest \
python311-six"

inherit rpm
