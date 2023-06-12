SUMMARY = "Microsoft Azure Container Service Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Container Service Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "23.0.0"

RPM_NAME = "python311-azure-mgmt-containerservice-23.0.0-1.1.noarch.rpm"
RPM_HASH = "d6e539ed951d727ee161c02ca73b6cc7827c3eb9d9ed0d295d7264ad56a6bc87c9f9b761411785bbb4f9850e14f514645fe889f5d71835b14e9036ae4f74a84c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-containerservice) \
python311-azure-mgmt-containerservice \
python3dist(azure-mgmt-containerservice)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) \
python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
