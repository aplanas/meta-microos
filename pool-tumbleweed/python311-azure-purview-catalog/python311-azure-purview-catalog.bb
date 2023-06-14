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

RPM_NAME = "python311-azure-purview-catalog-1.0.0b4-1.3.noarch.rpm"
RPM_HASH = "c9bc1ea6edce5eebef3cace133ba9a6fe9fd8343e3d01e87cf97687fa3e2ff22a9c229c5be9979fce4082750a954c1ddb2cb86cbf5dee8e3d3d0b85fd0f54c96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-purview-catalog \
python311-azure-purview-catalog \
python3dist-azure-purview-catalog"

RDEPENDS:${PN} += "python-abi \
python311-azure-core \
python311-azure-nspkg \
python311-azure-purview-nspkg \
python311-msrest"

inherit rpm
