SUMMARY = "Microsoft Azure Synapse Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Synapse Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.1.0b5"

RPM_NAME = "python311-azure-mgmt-synapse-2.1.0b5-1.4.noarch.rpm"
RPM_HASH = "c58bd4ab19d95d7ec8644a60bd5b22f60c139234b016766d377a44f18143048266ffdd71db984845a672ae9c815ef5e351aa0776ee8aa2c30f8c1b40c0c57c17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-synapse \
python3.11dist-azure-mgmt-synapse \
python311-azure-mgmt-synapse \
python3dist-azure-mgmt-synapse"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
