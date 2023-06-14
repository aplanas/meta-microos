SUMMARY = "Microsoft Azure MyService Management Client Library"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-attestation-1.0.0.0-1.10.noarch.rpm"
RPM_HASH = "12de76160a26d34ac72997c447b27cb287f48d1bed19f9d34d07667fa01f45f950d925782d8a7e42c2f6564ba943de9f9c49c63dc4329b8401ced3a741ab3b36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-attestation \
python311-azure-mgmt-attestation \
python3dist-azure-mgmt-attestation"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
