SUMMARY = "Microsoft Azure Image Builder Client Library"
DESCRIPTION = "This is the Microsoft Azure Image Builder Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python39-azure-mgmt-imagebuilder-1.2.0-1.1.noarch.rpm"
RPM_HASH = "76376d49b2abc1a44d4c4d86a4acb7e184595b3ee2362bcbf92ae326a7a85088c67f4ee3c710838f3777831b9a037e45d8ae7c6f84af096fa0d0ddf9ac635fa2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-imagebuilder \
python39-azure-mgmt-imagebuilder \
python3dist-azure-mgmt-imagebuilder"

RDEPENDS:${PN} += "-python39-typing-extensions >= 4.3.0 if python39-base < 3.8 \
python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
