SUMMARY = "Microsoft Azure Image Builder Client Library"
DESCRIPTION = "This is the Microsoft Azure Image Builder Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python310-azure-mgmt-imagebuilder-1.2.0-1.1.noarch.rpm"
RPM_HASH = "aa7db62c8543204f5d7d80d45f17454169dff893753a9fff1c7f3094a7bf77593627b8074598a7281bb9cda758f84c61dfa2407e5636463781aa2519c44e0ca4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-imagebuilder \
python3.10dist-azure-mgmt-imagebuilder \
python310-azure-mgmt-imagebuilder \
python3dist-azure-mgmt-imagebuilder"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
