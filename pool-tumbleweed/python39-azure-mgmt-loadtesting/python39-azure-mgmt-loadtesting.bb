SUMMARY = "Microsoft Azure Loadtesting Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Loadtesting Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-mgmt-loadtesting-1.0.0-1.4.noarch.rpm"
RPM_HASH = "7c45e5db0c302e6a8844734ca2e72744c3c8294978456be3583fe31bc8c6312e36f195f6998b9c413bc2d9574410a45ee5e64cb434a95e9919e7c59efc200cec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-loadtesting \
python39-azure-mgmt-loadtesting \
python3dist-azure-mgmt-loadtesting"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
