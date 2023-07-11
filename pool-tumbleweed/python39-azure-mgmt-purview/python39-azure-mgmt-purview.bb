SUMMARY = "Microsoft Azure Purview Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Purview Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-mgmt-purview-1.0.0-1.9.noarch.rpm"
RPM_HASH = "fc837ee4d074cfeb98378b031eebbba23034392b5dce0093d9f6e0d1695ee3992bb658b88d638e7f2b0ea473cdc2f3126b6a0cb3f4761445c04113c11061ce12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-purview \
python39-azure-mgmt-purview \
python3dist-azure-mgmt-purview"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
