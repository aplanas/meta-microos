SUMMARY = "Microsoft Azure Synapse Monitoring Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Synapse Monitoring Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python311-azure-synapse-monitoring-0.2.0-1.10.noarch.rpm"
RPM_HASH = "a0abdf718e36d8e3ed1ddf7a86e22775228e1bdef737f142060ba7829f6fe155cd165ecbc394831e7365afb64eaacdd5a158914b511990e4c9eaf678a22b7883"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-synapse-monitoring) \
python311-azure-synapse \
python311-azure-synapse-monitoring \
python3dist(azure-synapse-monitoring)"

RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-core \
python311-azure-nspkg \
python311-azure-synapse-nspkg \
python311-msrest"

inherit rpm
