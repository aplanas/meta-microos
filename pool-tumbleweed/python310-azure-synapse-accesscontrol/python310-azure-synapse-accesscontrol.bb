SUMMARY = "Microsoft Azure Synapse AccessControl Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Synapse AccessControl Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python310-azure-synapse-accesscontrol-0.7.0-1.10.noarch.rpm"
RPM_HASH = "4d4aedef4a3748600a724bbcaaf8d9cfae7f8f615b8aaff12782a8440c585c9de45e5ff3cde60bff1ea4e4620dcfa5659738a4b494a3a4275d0a30b4867fd533"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-synapse-accesscontrol \
python310-azure-synapse \
python310-azure-synapse-accesscontrol \
python3dist-azure-synapse-accesscontrol"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-core \
python310-azure-nspkg \
python310-azure-synapse-nspkg \
python310-msrest"

inherit rpm
