SUMMARY = "Microsoft Azure Kusto Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Kusto Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python39-azure-mgmt-kusto-3.1.0-1.3.noarch.rpm"
RPM_HASH = "011300061d2ad8f9fe185354d7b9819a87bd9249bff3041f190a668a5272f7a3fee65e1ba7260d3b523e8c597bf50d2a2966fb7eca9ec6c7002a22c9ca8d9ad2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-kusto \
python39-azure-mgmt-kusto \
python3dist-azure-mgmt-kusto"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
