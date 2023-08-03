SUMMARY = "Microsoft Azure Elasticsan Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Elasticsan Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python310-azure-mgmt-elasticsan-1.0.0b2-1.1.noarch.rpm"
RPM_HASH = "dbe82f5435b13879eef80ff9ff1c660bbcef48ee26ec4c08bb1473be5e2a702bc4b58d6952e36060872e6e06a887ca391fbacd9715fcc044e6196116b92a4cc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-elasticsan \
python310-azure-mgmt-elasticsan \
python3dist-azure-mgmt-elasticsan"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
