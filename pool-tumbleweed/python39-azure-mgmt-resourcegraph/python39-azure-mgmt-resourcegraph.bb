SUMMARY = "Microsoft Azure Resource Graph Client Library"
DESCRIPTION = "This is the Microsoft Azure Resource Graph Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "python39-azure-mgmt-resourcegraph-8.0.0-1.9.noarch.rpm"
RPM_HASH = "03df67688a34cee3f9ddcc10bb1bc2c67804ac5e58b2079b3993a08983b54cdca8fce39da4f2662b3f82eb12995fa2588513ffe4a72947f30d2a4c6a7f398a18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-resourcegraph \
python39-azure-mgmt-resourcegraph \
python3dist-azure-mgmt-resourcegraph"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
