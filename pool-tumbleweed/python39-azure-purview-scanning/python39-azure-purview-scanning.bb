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

RPM_NAME = "python39-azure-purview-scanning-1.0.0b2-1.10.noarch.rpm"
RPM_HASH = "9c8c78f88f83950ca091a1e84c67a8639196949163f89cd986bae913c7b690cbe604a51d77d06eb840413f3c74ea78d95c4f535a038a5e8e00d832fe2b85297d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-purview-scanning \
python39-azure-purview-scanning \
python3dist-azure-purview-scanning"

RDEPENDS:${PN} += "python-abi \
python39-azure-core \
python39-azure-nspkg \
python39-azure-purview-nspkg \
python39-msrest \
python39-six"

inherit rpm
