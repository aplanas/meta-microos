SUMMARY = "Microsoft Azure Synapse Monitoring Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Synapse Monitoring Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python310-azure-synapse-monitoring-0.2.0-1.10.noarch.rpm"
RPM_HASH = "d8cf2a62abb18fdb140dbbd4e1141f975638d8dcdcf553d986f6a8deed1b44bf68f757faaa2d617594f81792e9751c66ba110e00f9be79ba3b90f0fe45895322"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-synapse \
python3-azure-synapse-monitoring \
python3.10dist(azure-synapse-monitoring) \
python310-azure-synapse \
python310-azure-synapse-monitoring \
python3dist(azure-synapse-monitoring)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-core \
python310-azure-nspkg \
python310-azure-synapse-nspkg \
python310-msrest"

inherit rpm
