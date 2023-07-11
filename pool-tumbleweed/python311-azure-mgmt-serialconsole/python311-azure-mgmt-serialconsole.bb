SUMMARY = "Microsoft Azure SerialConsole Client Library"
DESCRIPTION = "This is the Microsoft Azure SerialConsole Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-serialconsole-1.0.0.0-1.4.noarch.rpm"
RPM_HASH = "562bf682166f71480baa3c95d33bff3333eb122039eeec1d97f35f12ac496617308dba046d931580d312c9fac4854c4057649d57a529ed8be4866ddbdbf0596a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-serialconsole \
python3.11dist-azure-mgmt-serialconsole \
python311-azure-mgmt-serialconsole \
python3dist-azure-mgmt-serialconsole"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
