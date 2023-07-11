SUMMARY = "Microsoft Azure Synapse Monitoring Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Synapse Monitoring Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python39-azure-synapse-monitoring-0.2.0-1.12.noarch.rpm"
RPM_HASH = "f11815718038f87037869d53a4c71bf43c117bcf8e66d276bd492df29ea881b7e99ca5619f79e14d015e8d2190424d007d821bc1ca536e5a1eb92cca051ca89b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-synapse-monitoring \
python39-azure-synapse \
python39-azure-synapse-monitoring \
python3dist-azure-synapse-monitoring"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-core \
python39-azure-nspkg \
python39-azure-synapse-nspkg \
python39-msrest"

inherit rpm
