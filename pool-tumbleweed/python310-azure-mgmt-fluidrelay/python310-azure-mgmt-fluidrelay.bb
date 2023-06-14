SUMMARY = "Microsoft Azure Fluidrelay Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Fluidrelay Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-fluidrelay-1.0.0.0-1.4.noarch.rpm"
RPM_HASH = "1732639e265d279b96e3129e8d5f8efd7c88e86a5501ae58c7e0791d50363309d3c678cc565a538d24c70606cfc77d9d4588594e9fb24630535d6a151a6ff598"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-fluidrelay \
python3.10dist-azure-mgmt-fluidrelay \
python310-azure-mgmt-fluidrelay \
python3dist-azure-mgmt-fluidrelay"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
