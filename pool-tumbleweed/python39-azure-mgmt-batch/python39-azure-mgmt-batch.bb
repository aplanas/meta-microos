SUMMARY = "Microsoft Azure Batch Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Batch Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "17.0.0"

RPM_NAME = "python39-azure-mgmt-batch-17.0.0-1.3.noarch.rpm"
RPM_HASH = "42ed54b666a538911df7b8ede4c7c5d06fe5d6b153bf113c5abec1721429a46b395a941b080e665a78712a4411a05366af5202bad9f0e4c7a5243b22e00cae5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-batch \
python39-azure-mgmt-batch \
python3dist-azure-mgmt-batch"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
