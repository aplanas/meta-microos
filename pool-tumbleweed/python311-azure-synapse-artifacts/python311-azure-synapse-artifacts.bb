SUMMARY = "Microsoft Azure Synapse Artifacts Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Synapse Artifacts Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.17.0"

RPM_NAME = "python311-azure-synapse-artifacts-0.17.0-1.1.noarch.rpm"
RPM_HASH = "a0e2be9a5efaea98dcc4de99b44ed8b3a4a131c53d3690fc09a55d1fd51152b041c23660f40d8cd4224f9b9b02cd2188795009fe047dd730c125fb7df9d33a07"
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
python311-isodate"

inherit rpm
