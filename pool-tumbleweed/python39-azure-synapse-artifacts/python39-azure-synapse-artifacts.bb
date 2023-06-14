SUMMARY = "Microsoft Azure Synapse Artifacts Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Synapse Artifacts Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.16.0"

RPM_NAME = "python39-azure-synapse-artifacts-0.16.0-1.1.noarch.rpm"
RPM_HASH = "78a7f7844dfe5741f1ac89d28500f35a5e0ec59eb61a9aa9a291ba6205bfb80bf2ed8fbaefb1df09f4d8b45ad9a754bb861b73f6ab89ba75794fa3c93652a416"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-synapse-artifacts \
python39-azure-synapse \
python39-azure-synapse-artifacts \
python3dist-azure-synapse-artifacts"

RDEPENDS:${PN} += "python-abi \
python39-azure-core \
python39-azure-nspkg \
python39-azure-synapse-nspkg \
python39-msrest"

inherit rpm
