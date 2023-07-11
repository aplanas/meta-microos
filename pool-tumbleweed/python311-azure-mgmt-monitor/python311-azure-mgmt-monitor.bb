SUMMARY = "Microsoft Azure Monitor Client Library"
DESCRIPTION = "This is the Microsoft Azure Monitor Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "6.0.1"

RPM_NAME = "python311-azure-mgmt-monitor-6.0.1-1.2.noarch.rpm"
RPM_HASH = "353fcace6b429da9be12b62c7341841266088cf8a6ff38eb64a4484c26098bf23224cf281d92b892207e8a34f3692a8d2c3aaf68bad450fa23d355da58700132"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-monitor \
python3.11dist-azure-mgmt-monitor \
python311-azure-mgmt-monitor \
python3dist-azure-mgmt-monitor"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
