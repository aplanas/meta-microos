SUMMARY = "Microsoft Azure EventHub Management Client Library"
DESCRIPTION = "This is the Microsoft Azure EventHub Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "11.0.0"

RPM_NAME = "python39-azure-mgmt-eventhub-11.0.0-1.2.noarch.rpm"
RPM_HASH = "a2c171d864941340d0e5bf042d61fc7c196fc4640d1d79462532f93581ab491cbe4a0b15028481eee637590713e57799d415375640967e946e238ef5790c5a2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-eventhub \
python39-azure-mgmt-eventhub \
python3dist-azure-mgmt-eventhub"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
