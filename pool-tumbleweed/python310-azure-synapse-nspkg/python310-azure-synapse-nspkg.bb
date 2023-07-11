SUMMARY = "Microsoft Azure Synapse Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Synapse namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.synapse namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-synapse-nspkg-1.0.0-2.12.noarch.rpm"
RPM_HASH = "b921f9b2c8ff7f186f21cc6b37328224d2388a31bfbd40a9e81065d8c10b2e2d75cb6abb4bbb6b25b54ec7f708fd608228f8ed54305544b74adc120ff0f7d8c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-synapse-nspkg \
python310-azure-synapse \
python310-azure-synapse-nspkg \
python3dist-azure-synapse-nspkg"

RDEPENDS:${PN} += "python-abi \
python310-azure-nspkg"

inherit rpm
