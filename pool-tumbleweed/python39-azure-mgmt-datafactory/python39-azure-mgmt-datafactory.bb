SUMMARY = "Microsoft Azure Data Factory Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Data Factory Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python39-azure-mgmt-datafactory-3.1.0-1.2.noarch.rpm"
RPM_HASH = "8a53c7d2418d0976029fcdd51307fa81caeb17c2c70f0a14f4ba67de6a3c4bc9052eccc03733b2b28aebee2a949e4ef71986f905abac39863d095c5f018898f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-datafactory) \
python39-azure-mgmt-datafactory \
python3dist(azure-mgmt-datafactory)"

RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) \
python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
