SUMMARY = "Microsoft Azure Devcenter Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Devcenter Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-devcenter-1.0.0.0-1.1.noarch.rpm"
RPM_HASH = "435ede6eaeae76366304632a7a263c18fa2cb16a80ec2462909a6126cf0ea636ec5ae9f708ed6f4d9dd5db1373822ff2bab43edc88f32718553bf2a631f3a020"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-devcenter \
python3.10dist-azure-mgmt-devcenter \
python310-azure-mgmt-devcenter \
python3dist-azure-mgmt-devcenter"

RDEPENDS:${PN} += "-python310-typing-extensions >= 4.3.0 if python310-base < 3.8 \
python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
