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

RPM_NAME = "python39-azure-purview-catalog-1.0.0b4-1.3.noarch.rpm"
RPM_HASH = "86240eb1406fd2ff354ed78704d8484fc34d3175f229eba5381f53b44b9e8d76ceb7c568ec6ddec0783a314d3ae812c1fb1740a65fe5182742f0124d1c3d078c"
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
