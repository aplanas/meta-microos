SUMMARY = "Microsoft Azure Relay Client Library"
DESCRIPTION = "This is the Microsoft Azure Relay Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-azure-mgmt-relay-1.1.0-1.8.noarch.rpm"
RPM_HASH = "9eab16a2036835f0dc47d215794d803dd2d5689da63e88f9bf2ba5fee2cbea51bdba0d355ca5d01fa91b0441401782f7c4d4a1d662c1c90b29f5f18c9b3344df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-relay \
python3.10dist-azure-mgmt-relay \
python310-azure-mgmt-relay \
python3dist-azure-mgmt-relay"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
