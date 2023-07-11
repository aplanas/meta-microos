SUMMARY = "Microsoft Azure Purview Catalog Client Library for Python"
DESCRIPTION = "Azure Purview Catalog is a fully managed cloud service whose users can discover the \
data sources they need and understand the data sources they find. At the same time, \
Data Catalog helps organizations get more value from their existing investments. \
 \
 * Search for data using technical or business terms \
 * Browse associated technical, business, semantic, and operational metadata \
 * Identify the sensitivity level of data."
LICENSE = "MIT"

PV = "1.0.0b4"

RPM_NAME = "python311-azure-purview-catalog-1.0.0b4-1.5.noarch.rpm"
RPM_HASH = "272cd0454987678017207bb58628fce06c565c3fd0cf1ae019152cc88ada0bbf5a7007c6526d537391bcdb9c046a6ce19d1c0ddf137808e18e2d8cdbfc1ed9d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-purview-catalog \
python3.11dist-azure-purview-catalog \
python311-azure-purview-catalog \
python3dist-azure-purview-catalog"

RDEPENDS:${PN} += "python-abi \
python311-azure-core \
python311-azure-nspkg \
python311-azure-purview-nspkg \
python311-msrest"

inherit rpm
