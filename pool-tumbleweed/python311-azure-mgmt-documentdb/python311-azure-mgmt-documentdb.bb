SUMMARY = "Microsoft Azure DocumentDB Management Client Library"
DESCRIPTION = "This is the Microsoft Azure DocumentDB Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.3, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "0.1.3"

RPM_NAME = "python311-azure-mgmt-documentdb-0.1.3-6.12.noarch.rpm"
RPM_HASH = "a9c7a32fef29daa4620291e85ba11400bb30d5a665e67470e7c9ca4996089dbf9c95645e872ac7e238be353f93ef3240cd0b9e02377e0e83b6b04cbe8d13aced"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-documentdb \
python3.11dist-azure-mgmt-documentdb \
python311-azure-mgmt-documentdb \
python3dist-azure-mgmt-documentdb"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrestazure"

inherit rpm
