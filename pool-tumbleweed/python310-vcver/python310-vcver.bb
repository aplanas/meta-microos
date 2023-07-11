SUMMARY = "Provide package versions with version control data"
DESCRIPTION = "Python module to provide package versions with version control data."
LICENSE = "MIT"

PV = "0.2.12"

RPM_NAME = "python310-vcver-0.2.12-1.5.noarch.rpm"
RPM_HASH = "f8ec6f204f5346466aeed1dd8346036b606df23688700aeebbac27de4fa1a28cc7867c22ff9615f130f61b755dbe22ac32dc4efae2358aca40c996d245a21838"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-vcver \
python310-vcver \
python3dist-vcver"

RDEPENDS:${PN} += "python-abi \
python310-packaging"

inherit rpm
