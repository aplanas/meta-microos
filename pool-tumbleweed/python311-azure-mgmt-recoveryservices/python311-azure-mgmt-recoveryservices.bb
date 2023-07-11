SUMMARY = "Microsoft Azure Recovery Services Client Library"
DESCRIPTION = "This is the Microsoft Azure Recovery Services Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python311-azure-mgmt-recoveryservices-2.4.0-1.2.noarch.rpm"
RPM_HASH = "d06fe4c3fc727596771e07359c221f7b7b15e454efa8ae2332fc5015e168900ebb0d72c6f301c1499328ca85261e50a6b72e3b9534be92180832a84b0a6383f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-recoveryservices \
python3.11dist-azure-mgmt-recoveryservices \
python311-azure-mgmt-recoveryservices \
python3dist-azure-mgmt-recoveryservices"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
