SUMMARY = "Microsoft Azure Commerce Client Library"
DESCRIPTION = "This is the Microsoft Azure Commerce Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "6.0.0"

RPM_NAME = "python311-azure-mgmt-commerce-6.0.0-1.11.noarch.rpm"
RPM_HASH = "6d9c82072656165695c13389fcdb815f180e5868c5b74829ea55126b41807ec48b079a0b802c8edc85fc0551f218f98115c3a5f44306d274507cf532e9025b09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-commerce \
python3.11dist-azure-mgmt-commerce \
python311-azure-mgmt-commerce \
python3dist-azure-mgmt-commerce"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg"

inherit rpm
