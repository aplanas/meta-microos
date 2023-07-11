SUMMARY = "MS Azure Recoveryservicessiterecovery Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Recoveryservicessiterecovery Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-recoveryservicessiterecovery-1.0.0.0-2.3.noarch.rpm"
RPM_HASH = "83c0cdcf7c2eb171b6718f6956b6236a06d6f8c4b22cfa36e8978d671415cc5e262320a82af02bf1522795be1072d8149006bcb520a63b502a7d4d54e7da388c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-recoveryservicessiterecovery \
python310-azure-mgmt-recoveryservicessiterecovery \
python3dist-azure-mgmt-recoveryservicessiterecovery"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
