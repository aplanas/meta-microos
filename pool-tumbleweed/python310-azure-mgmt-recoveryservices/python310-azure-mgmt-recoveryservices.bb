SUMMARY = "Microsoft Azure Recovery Services Client Library"
DESCRIPTION = "This is the Microsoft Azure Recovery Services Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python310-azure-mgmt-recoveryservices-2.4.0-1.1.noarch.rpm"
RPM_HASH = "2641ae5b14dcca9f4947870b92382faf21d03e3c3958613400ca72091085cbcc50548796735299f863cb170e8f1968a2f8239923f51624d4bac103b350a13e83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-recoveryservices \
python3.10dist-azure-mgmt-recoveryservices \
python310-azure-mgmt-recoveryservices \
python3dist-azure-mgmt-recoveryservices"

RDEPENDS:${PN} += "-python310-typing-extensions >= 4.3.0 if python310-base < 3.8 \
python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
