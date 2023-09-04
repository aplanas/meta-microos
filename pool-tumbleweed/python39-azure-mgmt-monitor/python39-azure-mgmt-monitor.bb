SUMMARY = "Microsoft Azure Monitor Client Library"
DESCRIPTION = "This is the Microsoft Azure Monitor Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "6.0.2"

RPM_NAME = "python39-azure-mgmt-monitor-6.0.2-1.1.noarch.rpm"
RPM_HASH = "6229ed888bcced6abea9e2cee0fd34089b7690e6d36299ac92df0c936cf73f83347ed164e1aa2ca9275ea2eb1ea2a9176516a5352665e49a74e808999280875f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-monitor \
python39-azure-mgmt-monitor \
python3dist-azure-mgmt-monitor"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
