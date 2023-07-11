SUMMARY = "Microsoft Azure Authorization Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Authorization Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python39-azure-mgmt-authorization-3.0.0-1.4.noarch.rpm"
RPM_HASH = "2d5067f70f9fdcb711eb796a70cc66f1cd1c2bfb915d6686cd3e6f7b10f09518204fe48b85e2debe6251708d7db91608e0b05170ccd1653d5901c0c09ea8955e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-authorization \
python39-azure-mgmt-authorization \
python3dist-azure-mgmt-authorization"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-nspkg \
python39-msrest"

inherit rpm
