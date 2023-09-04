SUMMARY = "Microsoft Azure NetApp Files Management Client Library"
DESCRIPTION = "This is the Microsoft Azure NetApp Files Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "10.1.0"

RPM_NAME = "python39-azure-mgmt-netapp-10.1.0-1.1.noarch.rpm"
RPM_HASH = "96623abf25e63bbea45a288fb4bb87f6b0ec4cae02c39f91370d673ec5830b941076d9f44fe096585822d75c162e4a9d65a0171cf232fcf2b169374297b07e60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-netapp \
python39-azure-mgmt-netapp \
python3dist-azure-mgmt-netapp"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
