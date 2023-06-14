SUMMARY = "Microsoft Azure Synapse Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Synapse namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.synapse namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-synapse-nspkg-1.0.0-2.11.noarch.rpm"
RPM_HASH = "dab0765075993a4c99f308d9d76f0a1ff3e569953e75862552dd01dd8ff97e4b28b43a911f88849592d949394e1048cae21a1ffb6c4116c813503384933e3c1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-synapse-nspkg \
python311-azure-synapse \
python311-azure-synapse-nspkg \
python3dist-azure-synapse-nspkg"

RDEPENDS:${PN} += "python-abi \
python311-azure-nspkg"

inherit rpm
