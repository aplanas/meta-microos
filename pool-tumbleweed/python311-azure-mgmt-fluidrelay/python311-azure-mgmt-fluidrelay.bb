SUMMARY = "Microsoft Azure Fluidrelay Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Fluidrelay Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-fluidrelay-1.0.0.0-1.4.noarch.rpm"
RPM_HASH = "703f39c41d5ee6cf8b86fb144bc0aa4f36eacc35734503f58e5ceaf3bd245205a90cbfca75b266f1f3b1000cef7bcbb7fec67cca983cd2253c1d1c1dcb7a00c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-fluidrelay \
python311-azure-mgmt-fluidrelay \
python3dist-azure-mgmt-fluidrelay"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
