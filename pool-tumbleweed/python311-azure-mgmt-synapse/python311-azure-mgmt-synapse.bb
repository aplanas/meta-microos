SUMMARY = "Microsoft Azure Synapse Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Synapse Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.1.0b5"

RPM_NAME = "python311-azure-mgmt-synapse-2.1.0b5-1.3.noarch.rpm"
RPM_HASH = "d39cec93c71baa47591a6023a8c4e8149a009c07ee0e9e4c9a9005fd43d87aa9c8ffd0fd453e9dfdbdefb561d78b65bef3ebc0f3bd7cb7176f5d933484b0d610"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-synapse) \
python311-azure-mgmt-synapse \
python3dist(azure-mgmt-synapse)"

RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
