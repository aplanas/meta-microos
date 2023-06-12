SUMMARY = "Microsoft Azure Monitor Client Library"
DESCRIPTION = "This is the Microsoft Azure Monitor Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.3, 3.4 and 3.5."
LICENSE = "MIT"

PV = "0.3.1"

RPM_NAME = "python311-azure-monitor-0.3.1-3.11.noarch.rpm"
RPM_HASH = "7e2ff87ffa2de8cc5d51d98946ae451809a1c1dcd0a4f4b43aa1114a8592ea2f3667587db4c73742de36de99a1b0cf727f6401aaf2038ee1ca22675d57d410a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-monitor) \
python311-azure-monitor \
python3dist(azure-monitor)"
RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-nspkg \
python311-msrestazure"

inherit rpm
