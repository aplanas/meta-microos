SUMMARY = "Microsoft Azure Purview Scanning Client Library for Python"
DESCRIPTION = "Azure Purview Scanning is a fully managed cloud service whose users can scan your \
data into your data estate (also known as your catalog). Scanning is a process by \
which the catalog connects directly to a data source on a user-specified schedule. \
 \
 * Scan your data into your catalog \
 * Examine your data \
 * Extract schemas from your data"
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python310-azure-purview-scanning-1.0.0b2-1.8.noarch.rpm"
RPM_HASH = "c91c94e7ca641fbac02e41993032164b577db75d6934357ad453b40269375becb3b72215f73b5500e37a677af243fedeff9fa1e824378b8b284f76e9e71cc1b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-purview-scanning \
python3.10dist-azure-purview-scanning \
python310-azure-purview-scanning \
python3dist-azure-purview-scanning"

RDEPENDS:${PN} += "python-abi \
python310-azure-core \
python310-azure-nspkg \
python310-azure-purview-nspkg \
python310-msrest \
python310-six"

inherit rpm
