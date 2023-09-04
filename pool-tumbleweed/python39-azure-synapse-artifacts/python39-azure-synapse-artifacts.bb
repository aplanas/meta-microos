SUMMARY = "Microsoft Azure Synapse Artifacts Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Synapse Artifacts Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.17.0"

RPM_NAME = "python39-azure-synapse-artifacts-0.17.0-1.1.noarch.rpm"
RPM_HASH = "248e52a30fd6b483e7f96c9e16d7c8b788f44aa51c43fb0b4329f96a1e109d9899a1f36ad4770e2221dcfbfc29329c8c659b09c9af63eea3a5c7e7bc55bbc052"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-synapse-artifacts \
python39-azure-synapse \
python39-azure-synapse-artifacts \
python3dist-azure-synapse-artifacts"

RDEPENDS:${PN} += "python-abi \
python39-azure-core \
python39-azure-nspkg \
python39-azure-synapse-nspkg \
python39-isodate"

inherit rpm
