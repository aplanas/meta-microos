SUMMARY = "Microsoft Azure Networkcloud Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Networkcloud Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-mgmt-networkcloud-1.0.0-1.1.noarch.rpm"
RPM_HASH = "546bbc301f4002f7d055078e23bb94c7bcc7cff66057571055aaa4c6dc47b6ae134b9b991d9f7a6406ef4a0fe384afc8c212b78c3fbb5a7df837051c0453ebee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-networkcloud \
python3.11dist-azure-mgmt-networkcloud \
python311-azure-mgmt-networkcloud \
python3dist-azure-mgmt-networkcloud"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
