SUMMARY = "Microsoft Azure Commerce Client Library"
DESCRIPTION = "This is the Microsoft Azure Commerce Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "6.0.0"

RPM_NAME = "python310-azure-mgmt-commerce-6.0.0-1.11.noarch.rpm"
RPM_HASH = "3acc062747849fac1374eb75abd40f0567d5c280420c0e7f303851cb0772a5605af9595b5631033b5170c942f3f4915083e44c827ada83016b2917fece3fb328"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-commerce \
python310-azure-mgmt-commerce \
python3dist-azure-mgmt-commerce"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg"

inherit rpm
