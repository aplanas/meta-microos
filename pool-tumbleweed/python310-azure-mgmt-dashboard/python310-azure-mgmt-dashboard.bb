SUMMARY = "Microsoft Azure Dashboard Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Dashboard Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-dashboard-1.0.0.0-1.3.noarch.rpm"
RPM_HASH = "f87a3ecabd2bf219f6812d6193b5ab5b2c329244e85042b0ea09c9442b4cdd7a28ed0f9faf2f9614583275afdc448fcc1ad3025007328a6bdb543af2835c0c20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-dashboard \
python3.10dist(azure-mgmt-dashboard) \
python310-azure-mgmt-dashboard \
python3dist(azure-mgmt-dashboard)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
