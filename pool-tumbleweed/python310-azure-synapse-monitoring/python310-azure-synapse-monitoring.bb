SUMMARY = "Microsoft Azure Synapse Monitoring Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Synapse Monitoring Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python310-azure-synapse-monitoring-0.2.0-1.12.noarch.rpm"
RPM_HASH = "473d7df69139cf017b587019ba322f4233007bf64a311ff69cf2a1969fd67b7c96ab563af677a7c00c76d9400c3159121057f87160784245a56d8d8d856f6906"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-synapse-monitoring \
python310-azure-synapse \
python310-azure-synapse-monitoring \
python3dist-azure-synapse-monitoring"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-core \
python310-azure-nspkg \
python310-azure-synapse-nspkg \
python310-msrest"

inherit rpm
