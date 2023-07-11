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

RPM_NAME = "python310-azure-purview-catalog-1.0.0b4-1.5.noarch.rpm"
RPM_HASH = "de51420246fe526cec560a962e033f1b13f0ebaf42a0968a5c372899ba902d31bd48a899a6dca4fa1037ff903d46449dc58a994bfa4b434e97b511f18840142a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-purview-catalog \
python310-azure-purview-catalog \
python3dist-azure-purview-catalog"

RDEPENDS:${PN} += "python-abi \
python310-azure-core \
python310-azure-nspkg \
python310-azure-purview-nspkg \
python310-msrest"

inherit rpm
