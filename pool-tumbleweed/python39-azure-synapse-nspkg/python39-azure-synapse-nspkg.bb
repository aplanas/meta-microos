SUMMARY = "Microsoft Azure Synapse Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Synapse namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.synapse namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-synapse-nspkg-1.0.0-2.11.noarch.rpm"
RPM_HASH = "77f502151903987bde16d3a10eb390fed2dee7bcbac3629d6d5ddc9fb606315b767ff92e73a69f8c2619475d96a3efac4ac3a1dab5c56c6a798684c9ccd25706"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-synapse-nspkg) \
python39-azure-synapse \
python39-azure-synapse-nspkg \
python3dist(azure-synapse-nspkg)"

RDEPENDS:${PN} += "python(abi) \
python39-azure-nspkg"

inherit rpm
