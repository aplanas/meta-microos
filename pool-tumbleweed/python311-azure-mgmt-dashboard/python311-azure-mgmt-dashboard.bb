SUMMARY = "Microsoft Azure Dashboard Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Dashboard Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-dashboard-1.0.0.0-1.4.noarch.rpm"
RPM_HASH = "4ec0b0bc0e8abf94bb8f9e5e6af084c655b83c66475c98b23a45780598e5c8ff53c9c80b99f796b7ee8f61375b4cd9c9d2197559eb10af3ec667882e8b0ae1ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-dashboard \
python3.11dist-azure-mgmt-dashboard \
python311-azure-mgmt-dashboard \
python3dist-azure-mgmt-dashboard"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
