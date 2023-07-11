SUMMARY = "Microsoft Azure Scheduler Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Scheduler Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-azure-mgmt-scheduler-2.0.0-4.12.noarch.rpm"
RPM_HASH = "06218a73ecf920bd09e275e06fa915fbc0a254a9fd3a0983d4d92313aaf7392298ebe0ec2cd49f7c1f8951b2aad0dbafb4b4983a2a2ba4f90c5567076f6ccf0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-scheduler \
python3.11dist-azure-mgmt-scheduler \
python311-azure-mgmt-scheduler \
python3dist-azure-mgmt-scheduler"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrestazure"

inherit rpm
