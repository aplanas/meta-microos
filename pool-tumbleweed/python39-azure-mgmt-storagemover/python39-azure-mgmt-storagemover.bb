SUMMARY = "Microsoft Azure Storagemover Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Storagemover Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-mgmt-storagemover-1.0.0-1.3.noarch.rpm"
RPM_HASH = "0c818441fcc56012f77dda5e53218d4b694f56061c20f7d3f48539c916f9c4ee97c0ddadfea9a92c5af4af0b4ca8fc310f784c2121e1f0db7a2b2d8fd6a5a2b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-storagemover \
python39-azure-mgmt-storagemover \
python3dist-azure-mgmt-storagemover"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
