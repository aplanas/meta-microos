SUMMARY = "Microsoft Azure Service Fabric Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Fabric Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-azure-mgmt-servicefabric-2.0.0-1.9.noarch.rpm"
RPM_HASH = "3e4d9142243c84a46edbd48dc066a650ed10dce54c51de023d658b54e0a5a9ed9bb922d90700580a342c39de2ed1c6ffe455ffae7461dae4baa8fee2c28170d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-servicefabric \
python310-azure-mgmt-servicefabric \
python3dist-azure-mgmt-servicefabric"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
