SUMMARY = "Microsoft Azure NetApp Files Management Client Library"
DESCRIPTION = "This is the Microsoft Azure NetApp Files Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "10.1.0"

RPM_NAME = "python310-azure-mgmt-netapp-10.1.0-1.1.noarch.rpm"
RPM_HASH = "6f84aa79bca73a6dc0f4cefa5afbf61d0c8593fa9b2ed2fda4e50a282e76969133450d657d2342f2a8eb07d361ebff698f2f4bf2d628e15faf65e46c6ad57852"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-netapp \
python310-azure-mgmt-netapp \
python3dist-azure-mgmt-netapp"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
