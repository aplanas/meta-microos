SUMMARY = "Microsoft Azure Scheduler Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Scheduler Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-azure-mgmt-scheduler-2.0.0-4.11.noarch.rpm"
RPM_HASH = "039a1d3e5b4ec2870c906406dbe13ca9f2495caca30a3478e994381ad9abc8883dad8254fc8c207cd1f0d28d3c70a93c222baaebf89cab381916b1fcddf9fc1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-scheduler \
python3.10dist-azure-mgmt-scheduler \
python310-azure-mgmt-scheduler \
python3dist-azure-mgmt-scheduler"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrestazure"

inherit rpm
