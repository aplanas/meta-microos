SUMMARY = "Microsoft Azure RDBMS Management Client Library"
DESCRIPTION = "This is the Microsoft Azure RDBMS Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.2.0b10"

RPM_NAME = "python311-azure-mgmt-rdbms-10.2.0b10-1.1.noarch.rpm"
RPM_HASH = "d20efc1693ed8b90413d98d79ef93e99b829c6de589263f5a267cb9d6bc443ec1a6ba3b5d1ba4e363972bc77353400e0da308019c6c76e50e34bb71f7e567b3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-rdbms \
python3.11dist-azure-mgmt-rdbms \
python311-azure-mgmt-rdbms \
python3dist-azure-mgmt-rdbms"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
