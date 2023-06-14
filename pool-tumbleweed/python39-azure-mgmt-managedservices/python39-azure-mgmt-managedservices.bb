SUMMARY = "Microsoft Azure Managed Services Client Library"
DESCRIPTION = "This is the Microsoft Azure Managed Services Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "6.0.0.0"

RPM_NAME = "python39-azure-mgmt-managedservices-6.0.0.0-1.8.noarch.rpm"
RPM_HASH = "a3398c95068add4a7df3718fc2e15914f59c7c04f520ef53673cd768435e6cc89893ae293dd79c153a60f66195467ce9530d6cf84451353618fd282d6183ce3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-managedservices \
python39-azure-mgmt-managedservices \
python3dist-azure-mgmt-managedservices"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
