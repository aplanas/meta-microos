SUMMARY = "Microsoft Azure Scheduler Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Scheduler Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-azure-mgmt-scheduler-2.0.0-4.12.noarch.rpm"
RPM_HASH = "f15ddd893d3e99b4c77799a6753f3021875686eb64acd0381e87f9bfdbf39739635d0225f0cfdc58fbc1dd5c9eb587a30d159ebecdc4487993ffa6f8ff03944b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-scheduler \
python39-azure-mgmt-scheduler \
python3dist-azure-mgmt-scheduler"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrestazure"

inherit rpm
