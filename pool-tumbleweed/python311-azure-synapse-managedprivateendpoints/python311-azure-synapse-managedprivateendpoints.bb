SUMMARY = "Microsoft Azure Synapse Managed Private Endpoints Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Synapse Managed Private Endpoints Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python311-azure-synapse-managedprivateendpoints-0.4.0-1.8.noarch.rpm"
RPM_HASH = "0cb756cccadd220a2d51d98769d7a7e9699690db5510e42cf6a55253a17b50d0f15b1f1035b9e723304f7d2559df98a5e32daa1967d05c0d6bd013ce4a800429"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-synapse-managedprivateendpoints) \
python311-azure-synapse \
python311-azure-synapse-managedprivateendpoints \
python3dist(azure-synapse-managedprivateendpoints)"

RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-core \
python311-azure-nspkg \
python311-azure-synapse-nspkg \
python311-msrest"

inherit rpm
