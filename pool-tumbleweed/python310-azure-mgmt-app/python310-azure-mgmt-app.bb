SUMMARY = "Microsoft Azure App Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure App Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python310-azure-mgmt-app-1.0.0b2-1.5.noarch.rpm"
RPM_HASH = "ac2c96bf6d60f4c6f03c508c6617583ef582ca42ae5769a41157d9b7fbc3050ab679b6d08de726be7b74e1e5b5643ad6d2a3077e21ed5c2df4e2a02305dbcefd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-app \
python3.10dist(azure-mgmt-app) \
python310-azure-mgmt-app \
python3dist(azure-mgmt-app)"

RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
