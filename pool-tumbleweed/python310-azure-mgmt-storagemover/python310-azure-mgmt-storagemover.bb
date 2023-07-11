SUMMARY = "Microsoft Azure Storagemover Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Storagemover Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-mgmt-storagemover-1.0.0-1.3.noarch.rpm"
RPM_HASH = "b35c9b68cf9dd34f6ae5dfba547afb51974d49cc08606eafd3f1736ea3204de35aaeefa91632a0930f67c052d2b477c3cc22d888c40cceadf242dd0562c020fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-storagemover \
python310-azure-mgmt-storagemover \
python3dist-azure-mgmt-storagemover"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
