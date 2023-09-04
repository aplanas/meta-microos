SUMMARY = "Microsoft Azure Chaos Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Chaos Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0b7"

RPM_NAME = "python311-azure-mgmt-chaos-1.0.0b7-1.1.noarch.rpm"
RPM_HASH = "e676733cd95bd5b16fc7f0779841b9b6f146df50c8ceef7dc1542b85c1ebec92f6263633c280e2c0ec0a2a1bfbddf33a54f3f475194e5706f174e1f47963fe66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-chaos \
python3.11dist-azure-mgmt-chaos \
python311-azure-mgmt-chaos \
python3dist-azure-mgmt-chaos"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
