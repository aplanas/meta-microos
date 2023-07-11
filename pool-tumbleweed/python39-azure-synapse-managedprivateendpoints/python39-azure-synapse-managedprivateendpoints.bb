SUMMARY = "Microsoft Azure Synapse Managed Private Endpoints Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Synapse Managed Private Endpoints Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python39-azure-synapse-managedprivateendpoints-0.4.0-1.10.noarch.rpm"
RPM_HASH = "8b05c809b46de522dd5a936fdaf713860dabdd02c7ec56cdca28f4acecca8f0e563ec4edc039d5e143f3021331fff0f1c404e2e752670d0988c9419f34504ca0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-synapse-managedprivateendpoints \
python39-azure-synapse \
python39-azure-synapse-managedprivateendpoints \
python3dist-azure-synapse-managedprivateendpoints"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-core \
python39-azure-nspkg \
python39-azure-synapse-nspkg \
python39-msrest"

inherit rpm
