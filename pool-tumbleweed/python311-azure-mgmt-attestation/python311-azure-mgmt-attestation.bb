SUMMARY = "Microsoft Azure MyService Management Client Library"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-attestation-1.0.0.0-1.11.noarch.rpm"
RPM_HASH = "0af2386ba1eee906707f2073113a1f905cdc1ea6a4948d3836eb544e7e9a081d083dc4493fc8e158b0a9c7bd4f0dc06e9b63a2f2b8dd7b63c3cf6c2e416fc14e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-attestation \
python3.11dist-azure-mgmt-attestation \
python311-azure-mgmt-attestation \
python3dist-azure-mgmt-attestation"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
