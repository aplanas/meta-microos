SUMMARY = "Microsoft Azure Synapse Monitoring Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Synapse Monitoring Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python311-azure-synapse-monitoring-0.2.0-1.12.noarch.rpm"
RPM_HASH = "7a5d5fa3221e58bbb833f249b2d011d93b1f5f094434e78e00daa03799f27f5e17a3401c5c4b8c70f61addd2486e6fc9578206fa61c680b5ffb0015ad7ebc4da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-synapse \
python3-azure-synapse-monitoring \
python3.11dist-azure-synapse-monitoring \
python311-azure-synapse \
python311-azure-synapse-monitoring \
python3dist-azure-synapse-monitoring"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-core \
python311-azure-nspkg \
python311-azure-synapse-nspkg \
python311-msrest"

inherit rpm
