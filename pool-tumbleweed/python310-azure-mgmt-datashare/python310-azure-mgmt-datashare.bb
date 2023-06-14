SUMMARY = "Microsoft Azure MyService Management Client Library"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-datashare-1.0.0.0-1.13.noarch.rpm"
RPM_HASH = "f4b4bf4bc5475e1175c60fe8b3fb3a2fa52751f4c93bdb59cc54696df4a55603ecba943db57c6205c3e888d8bea9e89bb692787929c9f1a928c9aa9648d9142e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-datashare \
python3.10dist-azure-mgmt-datashare \
python310-azure-mgmt-datashare \
python3dist-azure-mgmt-datashare"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
