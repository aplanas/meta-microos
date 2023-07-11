SUMMARY = "Microsoft Azure Synapse Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Synapse namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.synapse namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-synapse-nspkg-1.0.0-2.12.noarch.rpm"
RPM_HASH = "2750a3dd085cf18434cf7b39d2a8639f1baecb81ac4df582cfd23242461246b2965893ebd6593da36aa96433286e1c3c975574987ce5df1c6c85b56043847c75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-synapse-nspkg \
python39-azure-synapse \
python39-azure-synapse-nspkg \
python3dist-azure-synapse-nspkg"

RDEPENDS:${PN} += "python-abi \
python39-azure-nspkg"

inherit rpm
