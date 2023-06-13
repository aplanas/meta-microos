SUMMARY = "Microsoft Azure Elasticsan Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Elasticsan Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python39-azure-mgmt-elasticsan-1.0.0b1-1.3.noarch.rpm"
RPM_HASH = "d5911865e7603c3c4c6e96517260b223c1abd980c61a8fb724e04ccf58d59d2a9795e2d8afed36ac2926ef8868fd9ddbeb2e83cd142f98c93ac66c016582b808"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-elasticsan) \
python39-azure-mgmt-elasticsan \
python3dist(azure-mgmt-elasticsan)"

RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
