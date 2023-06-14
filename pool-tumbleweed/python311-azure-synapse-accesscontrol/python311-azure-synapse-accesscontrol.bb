SUMMARY = "Microsoft Azure Synapse AccessControl Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Synapse AccessControl Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python311-azure-synapse-accesscontrol-0.7.0-1.8.noarch.rpm"
RPM_HASH = "14d67204cc66cd7aeb6e62decd22a603b6993374a3c48789186a5f26fe46f27bb4f250efbde8c3d6243933cdb1e8ed91eb211355abd30eb37adf215ccf43b937"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-synapse-accesscontrol \
python311-azure-synapse \
python311-azure-synapse-accesscontrol \
python3dist-azure-synapse-accesscontrol"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-core \
python311-azure-nspkg \
python311-azure-synapse-nspkg \
python311-msrest"

inherit rpm
