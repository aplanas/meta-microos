SUMMARY = "Microsoft Azure Synapse Artifacts Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Synapse Artifacts Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.16.0"

RPM_NAME = "python311-azure-synapse-artifacts-0.16.0-1.3.noarch.rpm"
RPM_HASH = "7e16949e10dd6b94170500fac59a49808e314cebd4aab418f9692d6a2ece14b905886597328cdaba5000316be79d3263acc7243ae98fc37aa66103d8761c5ec7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-synapse \
python3-azure-synapse-artifacts \
python3.11dist-azure-synapse-artifacts \
python311-azure-synapse \
python311-azure-synapse-artifacts \
python3dist-azure-synapse-artifacts"

RDEPENDS:${PN} += "python-abi \
python311-azure-core \
python311-azure-nspkg \
python311-azure-synapse-nspkg \
python311-msrest"

inherit rpm
