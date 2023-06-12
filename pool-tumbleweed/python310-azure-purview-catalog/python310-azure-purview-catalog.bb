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

RPM_NAME = "python310-azure-purview-catalog-1.0.0b4-1.3.noarch.rpm"
RPM_HASH = "ebba494a061bc962b223c7058f6af75914154430289ef486f5eb4f48fcecc345dfe9da2e9fcaf68f2c975fb51494a94a7ce885a5fd86d7565a68ae9d1a267120"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-purview-catalog \
python3.10dist(azure-purview-catalog) \
python310-azure-purview-catalog \
python3dist(azure-purview-catalog)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-core \
python310-azure-nspkg \
python310-azure-purview-nspkg \
python310-msrest"

inherit rpm
