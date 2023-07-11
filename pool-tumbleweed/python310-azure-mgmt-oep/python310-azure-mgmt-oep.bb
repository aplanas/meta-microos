SUMMARY = "Microsoft Azure Oep Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Oep Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python310-azure-mgmt-oep-1.0.0b2-1.4.noarch.rpm"
RPM_HASH = "ea0cca509b5547f420e214b2278e0b6561f9b0a23fe3efd80ecfedea69f20a740fd83c871af1e3e945345dfb48fb8321aa207d234d329d2004cf4242de792017"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-oep \
python310-azure-mgmt-oep \
python3dist-azure-mgmt-oep"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
