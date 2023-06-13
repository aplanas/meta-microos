SUMMARY = "Microsoft Azure HybridKubernetes Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure HybridKubernetes Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8"
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-azure-mgmt-hybridkubernetes-1.1.0-1.8.noarch.rpm"
RPM_HASH = "42f1490e1722c61ccf86d3051cea1a7dad021de96bc313498d163213e13248a8d7fd9c7930bfb182c879435b26164a38f1340fc971b2cb5cb6e66d72609e32c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-hybridkubernetes) \
python39-azure-mgmt-hybridkubernetes \
python3dist(azure-mgmt-hybridkubernetes)"

RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
