SUMMARY = "Microsoft Azure Agfood Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Agfood Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python39-azure-mgmt-agfood-1.0.0b1-1.8.noarch.rpm"
RPM_HASH = "28a2db55fd22665b445e7cbace079cee74d1bef00f7a0f10c0951c51b2e0561ab6d7e5ba1d3ef6ec12c01040e15268257905753dbd17547955f6b4d582e88c2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-agfood) \
python39-azure-mgmt-agfood \
python3dist(azure-mgmt-agfood)"

RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
