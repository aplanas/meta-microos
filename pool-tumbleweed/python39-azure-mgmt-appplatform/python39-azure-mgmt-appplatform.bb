SUMMARY = "Microsoft Azure MyService Management Client Library"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "python39-azure-mgmt-appplatform-8.0.0-1.1.noarch.rpm"
RPM_HASH = "bcd498ecc767d614924bae9642e26b51c91abe38849d177b57883498f813ed3957ae4f4743e0b2a4c69793ea26c9668dfe2ba7fc5dd37518e06289bfe6929685"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-appplatform \
python39-azure-mgmt-appplatform \
python3dist-azure-mgmt-appplatform"

RDEPENDS:${PN} += "-python39-typing-extensions >= 4.3.0 if python39-base < 3.8 \
python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
