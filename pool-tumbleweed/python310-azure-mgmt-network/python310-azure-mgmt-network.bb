SUMMARY = "Microsoft Azure Network Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Network Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "23.1.0"

RPM_NAME = "python310-azure-mgmt-network-23.1.0-1.2.noarch.rpm"
RPM_HASH = "891e4f627d8ad59a545953eb127a97798ce5e971e42b49bd87a2eef5f761651ff87a62c8b5d833c9ce8fae98fe9fb85c0e8210a34f5bed2269636cb83c339389"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-network \
python310-azure-mgmt-network \
python3dist-azure-mgmt-network"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
