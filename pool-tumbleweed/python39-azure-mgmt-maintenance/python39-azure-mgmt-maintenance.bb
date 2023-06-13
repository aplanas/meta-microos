SUMMARY = "Microsoft Azure MyService Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs \
that replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-azure-mgmt-maintenance-2.0.0-1.8.noarch.rpm"
RPM_HASH = "7304383d16a3f2b1abd49420ba1746585ee851e6ae1af3812538182937e34513c2d2a6134e88c020b94103a4f774d6e745be0820e152a37337cbe767c7483bb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-maintenance) \
python39-azure-mgmt-maintenance \
python3dist(azure-mgmt-maintenance)"

RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
