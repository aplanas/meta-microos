SUMMARY = "Microsoft Azure Peering Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Peering Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-peering-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "7cff614fbed0b93ed573f97f905d5e642a7c836b44ccf514462d649cc3584ba0f341328835ff94fb901eb267fc1844a30314038b3f01940d321aede5032d78e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-peering \
python39-azure-mgmt-peering \
python3dist-azure-mgmt-peering"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
