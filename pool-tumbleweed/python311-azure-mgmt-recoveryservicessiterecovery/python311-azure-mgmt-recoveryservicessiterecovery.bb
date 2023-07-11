SUMMARY = "MS Azure Recoveryservicessiterecovery Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Recoveryservicessiterecovery Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-recoveryservicessiterecovery-1.0.0.0-2.3.noarch.rpm"
RPM_HASH = "e664072055c2f311c9b6e55ca72bcdef03653f75eb92c626e08157be2a55206ca12068050314bf31bae5598dccee6be023b66fe8335ed7011eb4bdef41e53f95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-recoveryservicessiterecovery \
python3.11dist-azure-mgmt-recoveryservicessiterecovery \
python311-azure-mgmt-recoveryservicessiterecovery \
python3dist-azure-mgmt-recoveryservicessiterecovery"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
