SUMMARY = "Microsoft Azure DocumentDB Management Client Library"
DESCRIPTION = "This is the Microsoft Azure DocumentDB Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.3, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "0.1.3"

RPM_NAME = "python39-azure-mgmt-documentdb-0.1.3-6.11.noarch.rpm"
RPM_HASH = "26501ec5e4dfb315534f9f32b039ddc8badab6035ed1fbcd17d5d91292e8cd87db229ac40508c553da9de23958a418613628e8be4a6ee449e593913e05d3af40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-documentdb \
python39-azure-mgmt-documentdb \
python3dist-azure-mgmt-documentdb"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrestazure"

inherit rpm
