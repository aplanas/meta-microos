SUMMARY = "Microsoft Azure MyService Management Client Library"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-attestation-1.0.0.0-1.11.noarch.rpm"
RPM_HASH = "2c64705a8171088946409305179932d9959f8cc047776c470ffd4bdd12dac2efa7089f6c3f9fd0afe5dc5ec76919ef8d7faa566033df9e32c27a0545f936a9e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-attestation \
python39-azure-mgmt-attestation \
python3dist-azure-mgmt-attestation"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
