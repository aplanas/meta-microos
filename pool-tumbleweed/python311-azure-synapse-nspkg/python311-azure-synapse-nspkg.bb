SUMMARY = "Microsoft Azure Synapse Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Synapse namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.synapse namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-synapse-nspkg-1.0.0-2.12.noarch.rpm"
RPM_HASH = "bdb8f1ccc25c7996513a85df9b7407c0e1cb308d470cd046029e2643110f5e6085ff182d96a568105ec40612c7a9c580c33191747eec5b1e777cc5104fb1f426"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-synapse \
python3-azure-synapse-nspkg \
python3.11dist-azure-synapse-nspkg \
python311-azure-synapse \
python311-azure-synapse-nspkg \
python3dist-azure-synapse-nspkg"

RDEPENDS:${PN} += "python-abi \
python311-azure-nspkg"

inherit rpm
