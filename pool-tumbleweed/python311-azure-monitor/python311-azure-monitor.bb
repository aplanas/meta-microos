SUMMARY = "Microsoft Azure Monitor Client Library"
DESCRIPTION = "This is the Microsoft Azure Monitor Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.3, 3.4 and 3.5."
LICENSE = "MIT"

PV = "0.3.1"

RPM_NAME = "python311-azure-monitor-0.3.1-3.12.noarch.rpm"
RPM_HASH = "affc764dddf2e62a428d202d21b07e876b73b580e54a5f16d46b3d66919896828f5071fa9f150174771dfef2a1b42e09a062ce730ce6f14cbd31b97b648889c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-monitor \
python3.11dist-azure-monitor \
python311-azure-monitor \
python3dist-azure-monitor"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-nspkg \
python311-msrestazure"

inherit rpm
