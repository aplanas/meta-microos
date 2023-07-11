SUMMARY = "Microsoft Azure Synapse AccessControl Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Synapse AccessControl Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python311-azure-synapse-accesscontrol-0.7.0-1.10.noarch.rpm"
RPM_HASH = "2d3da33c2f8010e398aa2b852b6c25731d832d9eb93a681308f4c5fc9dfdc9d47dd51c2ba279ce24846c17b3935afe9673887e8a0833f6fe7e8cd9da72a72607"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-synapse \
python3-azure-synapse-accesscontrol \
python3.11dist-azure-synapse-accesscontrol \
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
