SUMMARY = "Microsoft Azure Resource Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Resource Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "23.1.0~b2"

RPM_NAME = "python311-azure-mgmt-resource-23.1.0~b2-1.1.noarch.rpm"
RPM_HASH = "d07e46cc8aebb8a3800bb99c51a2c820bec015e5958242e00e61d2c4122edbcea82324fea5344eab09e2c69cfd6bd31f45d5bb38fc415af3d3d5c3e6d7bcb876"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-resource \
python3.11dist-azure-mgmt-resource \
python311-azure-mgmt-resource \
python3dist-azure-mgmt-resource"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
