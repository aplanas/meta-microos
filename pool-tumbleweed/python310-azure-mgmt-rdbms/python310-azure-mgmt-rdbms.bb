SUMMARY = "Microsoft Azure RDBMS Management Client Library"
DESCRIPTION = "This is the Microsoft Azure RDBMS Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.2.0b10"

RPM_NAME = "python310-azure-mgmt-rdbms-10.2.0b10-1.1.noarch.rpm"
RPM_HASH = "965e11ccb76cbe05f0c5c4c015a218879bdd6a8a7d1a652924a1c150dc05112c4a23a1466da8ac8722bbfab236429db51cb317e49316baebf84cbf723b3d1304"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-rdbms \
python310-azure-mgmt-rdbms \
python3dist-azure-mgmt-rdbms"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
