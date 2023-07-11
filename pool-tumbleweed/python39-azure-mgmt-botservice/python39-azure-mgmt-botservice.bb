SUMMARY = "Microsoft Azure Bot Service Client Library"
DESCRIPTION = "This is the Microsoft Azure Bot Service Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.0.0.0"

RPM_NAME = "python39-azure-mgmt-botservice-2.0.0.0-1.4.noarch.rpm"
RPM_HASH = "8fd6b927977c6152db60c1a17f6b058c6795d15dd87770a65c5530e28b38a8d310eaa0e107c0d9b35ce00122ffa6d9f7890fd4bade4c6fa1896925e657ff1c57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-botservice \
python39-azure-mgmt-botservice \
python3dist-azure-mgmt-botservice"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
