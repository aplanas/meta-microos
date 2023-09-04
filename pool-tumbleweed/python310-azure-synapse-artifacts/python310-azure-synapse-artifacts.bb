SUMMARY = "Microsoft Azure Synapse Artifacts Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Synapse Artifacts Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.17.0"

RPM_NAME = "python310-azure-synapse-artifacts-0.17.0-1.1.noarch.rpm"
RPM_HASH = "b251ca420e61de5b9d18dc93005f55c4716fa770ce3a734c2d6d1c3d76b370102d174698faade8277077658f1de701faeb1916b942ce666478658836b971364a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-synapse-artifacts \
python310-azure-synapse \
python310-azure-synapse-artifacts \
python3dist-azure-synapse-artifacts"

RDEPENDS:${PN} += "python-abi \
python310-azure-core \
python310-azure-nspkg \
python310-azure-synapse-nspkg \
python310-isodate"

inherit rpm
