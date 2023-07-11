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

RPM_NAME = "python310-azure-purview-scanning-1.0.0b2-1.10.noarch.rpm"
RPM_HASH = "c7c8dfc9bcd7ee2ebef9657c87d8a39157c061134f37b767f0c2b88b692513e24b5b56b1ffa4c9576530372475fdb9f202ccb71bfaf4d7d5c9b009108d633cdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-purview-scanning \
python310-azure-purview-scanning \
python3dist-azure-purview-scanning"

RDEPENDS:${PN} += "python-abi \
python310-azure-core \
python310-azure-nspkg \
python310-azure-purview-nspkg \
python310-msrest \
python310-six"

inherit rpm
