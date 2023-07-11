SUMMARY = "Microsoft Azure API Management Client Library"
DESCRIPTION = "This is the Microsoft Azure API Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python310-azure-mgmt-apimanagement-4.0.0-1.2.noarch.rpm"
RPM_HASH = "bc2536c77456c508eb9edece2c55b753af9133e4c078202b735cdbd6ff0377704f23f200d4799cc0cee83f3a9c362670e3342feb3e8e5c7c85c6dc8f068cec97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-apimanagement \
python310-azure-mgmt-apimanagement \
python3dist-azure-mgmt-apimanagement"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
