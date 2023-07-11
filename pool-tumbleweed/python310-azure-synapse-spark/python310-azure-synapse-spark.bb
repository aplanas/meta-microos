SUMMARY = "Microsoft Azure Synapse Spark Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Synapse AccessControl Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python310-azure-synapse-spark-0.7.0-1.10.noarch.rpm"
RPM_HASH = "87302f026e8cf81a64d26f5ff2ab5a42e964e168ebfda46886d95bc8a6ceca61fae702f6b1766ccce0f3c45d63761c0faabbaaaf6ede8a93e5f9a0e1661d8b6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-synapse-spark \
python310-azure-synapse \
python310-azure-synapse-spark \
python3dist-azure-synapse-spark"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-core \
python310-azure-nspkg \
python310-azure-synapse-nspkg \
python310-msrest"

inherit rpm
