SUMMARY = "Microsoft Azure Purview Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Purview Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-mgmt-purview-1.0.0-1.8.noarch.rpm"
RPM_HASH = "2833eb0388574548691ad26b6f0d693708fdf29682fafe339e254f05e100aa93afb145df0e938030923e06b1bc523f33df1a9b577f89bbc7f64b3ebc813501de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-purview) \
python311-azure-mgmt-purview \
python3dist(azure-mgmt-purview)"
RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
