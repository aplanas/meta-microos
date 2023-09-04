SUMMARY = "Microsoft Azure Authorization Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Authorization Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python310-azure-mgmt-authorization-4.0.0-1.1.noarch.rpm"
RPM_HASH = "2fb9b2648dcf1b76a2f3d665e48c415290979677078ce725d6cecaba474262df7749c11ec88d97bcac7ae17990994592c75744bf8b51b1d0d343846097811725"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-authorization \
python310-azure-mgmt-authorization \
python3dist-azure-mgmt-authorization"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-nspkg \
python310-isodate"

inherit rpm
