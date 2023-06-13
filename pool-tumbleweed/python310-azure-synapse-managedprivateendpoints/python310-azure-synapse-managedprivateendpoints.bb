SUMMARY = "Microsoft Azure Synapse Managed Private Endpoints Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Synapse Managed Private Endpoints Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python310-azure-synapse-managedprivateendpoints-0.4.0-1.8.noarch.rpm"
RPM_HASH = "485a8470593edb4af3356daefaf5de0d586aa843894cefe145a30d5148157448bbad1d5b648bf6c4aa862a0d4ef9e4a8da79c16da25967c97d52c2564c045622"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-synapse \
python3-azure-synapse-managedprivateendpoints \
python3.10dist(azure-synapse-managedprivateendpoints) \
python310-azure-synapse \
python310-azure-synapse-managedprivateendpoints \
python3dist(azure-synapse-managedprivateendpoints)"

RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-core \
python310-azure-nspkg \
python310-azure-synapse-nspkg \
python310-msrest"

inherit rpm
