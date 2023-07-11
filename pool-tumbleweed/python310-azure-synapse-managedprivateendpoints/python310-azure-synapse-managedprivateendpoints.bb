SUMMARY = "Microsoft Azure Synapse Managed Private Endpoints Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Synapse Managed Private Endpoints Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python310-azure-synapse-managedprivateendpoints-0.4.0-1.10.noarch.rpm"
RPM_HASH = "7d8fbbec6d263f47836037c460644dda0c9932b7d346c518a470e64299aabf1ad92bbeff067fdc5215851c5e1942e8c08aa6c94ae3195f0a357ab60f8cf11141"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-synapse-managedprivateendpoints \
python310-azure-synapse \
python310-azure-synapse-managedprivateendpoints \
python3dist-azure-synapse-managedprivateendpoints"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-core \
python310-azure-nspkg \
python310-azure-synapse-nspkg \
python310-msrest"

inherit rpm
