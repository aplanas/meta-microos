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

RPM_NAME = "python39-azure-purview-catalog-1.0.0b4-1.5.noarch.rpm"
RPM_HASH = "5c405b8dbaf06785d3b39497eb5f657a2d56bc89bbaa0537c6b7cc3626cf0bb0f69533bed29fafa76379e7e8b8a8a175b0a6df8b132c893c0265b7989dd8a11e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-purview-catalog \
python39-azure-purview-catalog \
python3dist-azure-purview-catalog"

RDEPENDS:${PN} += "python-abi \
python39-azure-core \
python39-azure-nspkg \
python39-azure-purview-nspkg \
python39-msrest"

inherit rpm
