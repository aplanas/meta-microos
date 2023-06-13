SUMMARY = "Microsoft Azure MyService Management Client Library"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-attestation-1.0.0.0-1.10.noarch.rpm"
RPM_HASH = "c4efc9c120fd1cf0197390af418e5ff0a6d41cc8263661a434c843d5ccdfef8dc5a81ec4a822502235d4a8503329e315b92b6bb16775cda9363412601409ae42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-attestation) \
python39-azure-mgmt-attestation \
python3dist(azure-mgmt-attestation)"

RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
