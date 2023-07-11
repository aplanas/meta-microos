SUMMARY = "Microsoft Azure Synapse Artifacts Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Synapse Artifacts Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.16.0"

RPM_NAME = "python39-azure-synapse-artifacts-0.16.0-1.3.noarch.rpm"
RPM_HASH = "fb252b5d99e66ad687ab1a1e51f0c2f035783bba9688c61fa9d831371cb320939a6b292817b4f47a6bc455b2c89b1022bedf93aef5564c73c695cc1ed106f0a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-synapse-artifacts \
python39-azure-synapse \
python39-azure-synapse-artifacts \
python3dist-azure-synapse-artifacts"

RDEPENDS:${PN} += "python-abi \
python39-azure-core \
python39-azure-nspkg \
python39-azure-synapse-nspkg \
python39-msrest"

inherit rpm
