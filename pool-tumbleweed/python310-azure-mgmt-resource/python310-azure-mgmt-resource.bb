SUMMARY = "Microsoft Azure Resource Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Resource Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "23.0.1"

RPM_NAME = "python310-azure-mgmt-resource-23.0.1-1.1.noarch.rpm"
RPM_HASH = "6ee63d6ee8994d128756ece30de1c6c64769cb963d329fea588b6d09332522ed952bbfbf66957b0afa5cdfca4c41a7787d7ba86cc685f0e68ee45aed51ad95bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-resource \
python3.10dist-azure-mgmt-resource \
python310-azure-mgmt-resource \
python3dist-azure-mgmt-resource"

RDEPENDS:${PN} += "-python310-typing-extensions >= 4.3.0 if python310-base < 3.8 \
python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
