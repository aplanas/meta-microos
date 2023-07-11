SUMMARY = "Microsoft Azure DocumentDB Management Client Library"
DESCRIPTION = "This is the Microsoft Azure DocumentDB Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.3, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "0.1.3"

RPM_NAME = "python39-azure-mgmt-documentdb-0.1.3-6.12.noarch.rpm"
RPM_HASH = "f2b9cc25919717bc372cc77596cd48841156b7a9a8a6688b4f5fa61338aa961fb7330116ff2bd6aa354dcec06040c237dbb23ae406fccf9752ddb468fef8c3dc"
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
