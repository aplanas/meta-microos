SUMMARY = "Microsoft Azure Qumulo Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Qumulo Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-mgmt-qumulo-1.0.0-1.1.noarch.rpm"
RPM_HASH = "3070631c707fe55bed4ca6366bf189e19c84f6e60dc9f272166ebaa91999370532c44117e73d71d33b47daf272b3a067d824f7cad753d6e96eca31577a9b22a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-qumulo) \
python311-azure-mgmt-qumulo \
python3dist(azure-mgmt-qumulo)"

RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) \
python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
