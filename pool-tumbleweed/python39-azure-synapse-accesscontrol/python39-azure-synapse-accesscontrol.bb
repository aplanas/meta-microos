SUMMARY = "Microsoft Azure Synapse AccessControl Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Synapse AccessControl Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python39-azure-synapse-accesscontrol-0.7.0-1.10.noarch.rpm"
RPM_HASH = "34f65507297c85cf70d2935acb7965685393de75c50b7a5a8fa27c09f1548fd9f8dc6d890f11a3d81d2ffb9a09ef0e7752d7fe01f0392992016f9ebe2afb324e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-synapse-accesscontrol \
python39-azure-synapse \
python39-azure-synapse-accesscontrol \
python3dist-azure-synapse-accesscontrol"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-core \
python39-azure-nspkg \
python39-azure-synapse-nspkg \
python39-msrest"

inherit rpm
