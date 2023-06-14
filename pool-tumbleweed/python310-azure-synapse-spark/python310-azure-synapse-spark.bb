SUMMARY = "Microsoft Azure Synapse Spark Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Synapse AccessControl Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python310-azure-synapse-spark-0.7.0-1.8.noarch.rpm"
RPM_HASH = "5f9fa84bf55fd97975493da2707dae1f9a3ca5b0bd99d585a367bcb38ca72891112f8bfe32f4a51557a21258f7b0c604a26a63b2063ba4a1f00bb59da539b07e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-synapse \
python3-azure-synapse-spark \
python3.10dist-azure-synapse-spark \
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
