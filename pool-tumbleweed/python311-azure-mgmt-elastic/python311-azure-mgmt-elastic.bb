SUMMARY = "Microsoft Azure Elastic Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Elastic Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-mgmt-elastic-1.0.0-1.9.noarch.rpm"
RPM_HASH = "2f42bf0cb8f923563fefac3a14c262ee4cf45e3f327785c468a3b3d8a707b9d9aae19dce3727b9c7ed8bc618ea4ac0f42cb757248688962fb0036839824a9ead"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-elastic \
python3.11dist-azure-mgmt-elastic \
python311-azure-mgmt-elastic \
python3dist-azure-mgmt-elastic"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
