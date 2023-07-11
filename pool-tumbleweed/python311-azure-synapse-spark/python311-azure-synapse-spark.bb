SUMMARY = "Microsoft Azure Synapse Spark Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Synapse AccessControl Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python311-azure-synapse-spark-0.7.0-1.10.noarch.rpm"
RPM_HASH = "dda52cdf146d615662e4ad1178c9e7583bb06708f150de4df1001ab648b861aab9c0ff4fb151c2e26141c21f63b813b33989891ef6756dcf5f7c0a0678be5999"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-synapse \
python3-azure-synapse-spark \
python3.11dist-azure-synapse-spark \
python311-azure-synapse \
python311-azure-synapse-spark \
python3dist-azure-synapse-spark"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-core \
python311-azure-nspkg \
python311-azure-synapse-nspkg \
python311-msrest"

inherit rpm
