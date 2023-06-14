SUMMARY = "Microsoft Azure MyService Management Client Library"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-azure-mgmt-healthcareapis-1.1.0-1.6.noarch.rpm"
RPM_HASH = "fe95429be060b25d279624ea20e36ad80338be527099d44410139b652f203bbebe46fe44f62240b0d91172a8bc3b8b76635fa5cfe88a0897922c2ce842e4c2cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-healthcareapis \
python39-azure-mgmt-healthcareapis \
python3dist-azure-mgmt-healthcareapis"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
