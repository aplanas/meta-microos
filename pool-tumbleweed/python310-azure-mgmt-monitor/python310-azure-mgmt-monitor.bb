SUMMARY = "Microsoft Azure Monitor Client Library"
DESCRIPTION = "This is the Microsoft Azure Monitor Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "6.0.1"

RPM_NAME = "python310-azure-mgmt-monitor-6.0.1-1.1.noarch.rpm"
RPM_HASH = "4c7bc63abb3ad509ea4a708c95d452e0029e7e073c76e09a2f9a060ab35123d408ff50a536c2a754d86ca8521a6fe688900a9a51839771fd9f67b89691752de9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-monitor \
python3.10dist-azure-mgmt-monitor \
python310-azure-mgmt-monitor \
python3dist-azure-mgmt-monitor"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
