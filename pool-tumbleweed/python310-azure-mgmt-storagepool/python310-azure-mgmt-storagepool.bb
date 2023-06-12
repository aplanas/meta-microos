SUMMARY = "Microsoft Azure Storagepool Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Storagepool Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-mgmt-storagepool-1.0.0-1.8.noarch.rpm"
RPM_HASH = "5a2d0b74e8ac94fb06492f09750b939389b774daa3b8b7352668a87a0ac65d009653b7b00d5005f96d969ce123a331af8b3a8bd93154b0f67d098240d6b2163c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-storagepool \
python3.10dist(azure-mgmt-storagepool) \
python310-azure-mgmt-storagepool \
python3dist(azure-mgmt-storagepool)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
