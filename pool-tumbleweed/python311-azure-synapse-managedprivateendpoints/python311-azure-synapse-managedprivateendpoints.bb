SUMMARY = "Microsoft Azure Synapse Managed Private Endpoints Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Synapse Managed Private Endpoints Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python311-azure-synapse-managedprivateendpoints-0.4.0-1.10.noarch.rpm"
RPM_HASH = "80b579fd7317d531059143ed45a7a153490cc11b73982abec1c17ee4bd6a467ba192e40903cf2135663040a58253b7a02da3683008e89a18f84403924ae0d2f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-synapse \
python3-azure-synapse-managedprivateendpoints \
python3.11dist-azure-synapse-managedprivateendpoints \
python311-azure-synapse \
python311-azure-synapse-managedprivateendpoints \
python3dist-azure-synapse-managedprivateendpoints"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-core \
python311-azure-nspkg \
python311-azure-synapse-nspkg \
python311-msrest"

inherit rpm
