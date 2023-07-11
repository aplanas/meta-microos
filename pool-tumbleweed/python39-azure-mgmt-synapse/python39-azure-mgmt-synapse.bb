SUMMARY = "Microsoft Azure Synapse Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Synapse Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.1.0b5"

RPM_NAME = "python39-azure-mgmt-synapse-2.1.0b5-1.4.noarch.rpm"
RPM_HASH = "321ac7de2bd9fbc32f0d973c80138bc65e80f40dbd965c06f63985789223a26bf84827217f8f3c12639c81ac6a20a605bff8846b14a0a4bad00a0ea6a4664d7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-synapse \
python39-azure-mgmt-synapse \
python3dist-azure-mgmt-synapse"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
