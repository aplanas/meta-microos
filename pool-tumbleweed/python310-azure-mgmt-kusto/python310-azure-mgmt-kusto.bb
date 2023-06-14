SUMMARY = "Microsoft Azure Kusto Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Kusto Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python310-azure-mgmt-kusto-3.1.0-1.2.noarch.rpm"
RPM_HASH = "7b185020daba4bcb6937cb1fe8da216f3233a1ff454acfc3ca5fa70b6c4bad142d8a5408bbc05e6b36caa3f769bd20393c1ae276a83bfa6b4378417400136084"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-kusto \
python3.10dist-azure-mgmt-kusto \
python310-azure-mgmt-kusto \
python3dist-azure-mgmt-kusto"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
