SUMMARY = "Microsoft Azure Synapse Artifacts Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Synapse Artifacts Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.16.0"

RPM_NAME = "python310-azure-synapse-artifacts-0.16.0-1.3.noarch.rpm"
RPM_HASH = "b248f5abf36775217c2e8c15c99adba69b489c1a7ec668b315b5b095ab94109b5949beb067ea07d2f0e12d6eae5737302a35c61ed46c464ff3a5b0530abbf868"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-synapse-artifacts \
python310-azure-synapse \
python310-azure-synapse-artifacts \
python3dist-azure-synapse-artifacts"

RDEPENDS:${PN} += "python-abi \
python310-azure-core \
python310-azure-nspkg \
python310-azure-synapse-nspkg \
python310-msrest"

inherit rpm
