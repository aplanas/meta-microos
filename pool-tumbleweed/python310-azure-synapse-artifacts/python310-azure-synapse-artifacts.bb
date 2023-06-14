SUMMARY = "Microsoft Azure Synapse Artifacts Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Synapse Artifacts Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.16.0"

RPM_NAME = "python310-azure-synapse-artifacts-0.16.0-1.1.noarch.rpm"
RPM_HASH = "a1dd56014c629757843a531a897ab1f00dac9126784c1cf81bfa88e78a86b79ed33cfd6b42116c9d2b86e8467c082f1355d22b819ab658a7f3e54694c41d539c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-synapse \
python3-azure-synapse-artifacts \
python3.10dist-azure-synapse-artifacts \
python310-azure-synapse \
python310-azure-synapse-artifacts \
python3dist-azure-synapse-artifacts"

RDEPENDS:${PN} += "python-abi \
python310-azure-core \
python310-azure-nspkg \
python310-azure-synapse-nspkg \
python310-msrest"

inherit rpm
