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

RPM_NAME = "python311-azure-purview-scanning-1.0.0b2-1.10.noarch.rpm"
RPM_HASH = "1c05b7763ea5440f49c85583e302cc8ee8215a39b7dea1975035da639cb38274af5234e3610054017bdfafb71e0f2a646acac13d6e9332bc5a0a0fe255630fa6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-purview-scanning \
python3.11dist-azure-purview-scanning \
python311-azure-purview-scanning \
python3dist-azure-purview-scanning"

RDEPENDS:${PN} += "python-abi \
python311-azure-core \
python311-azure-nspkg \
python311-azure-purview-nspkg \
python311-msrest \
python311-six"

inherit rpm
