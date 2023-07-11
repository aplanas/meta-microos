SUMMARY = "Microsoft Azure Purview Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Purview Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-mgmt-purview-1.0.0-1.9.noarch.rpm"
RPM_HASH = "024f98eaf354bb717ed21723faef43f702fc14da821a1aa249ec3be022809ec44d29ac9cbbe9d3de01aa49a193bef900451bf5929250ec7b7f5e9dc1caec898b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-purview \
python3.11dist-azure-mgmt-purview \
python311-azure-mgmt-purview \
python3dist-azure-mgmt-purview"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
