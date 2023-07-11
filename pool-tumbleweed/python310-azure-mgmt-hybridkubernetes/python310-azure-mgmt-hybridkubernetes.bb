SUMMARY = "Microsoft Azure HybridKubernetes Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure HybridKubernetes Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8"
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-azure-mgmt-hybridkubernetes-1.1.0-1.9.noarch.rpm"
RPM_HASH = "545fc6d3533c9fccfacaaea3f7ecaacf74b8111373b0e0ecea724cf536e7c8095fc0fc11efc94d1665ed85d66c2e118ddfab7552a1cc81572f7b9e4a10c74b67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-hybridkubernetes \
python310-azure-mgmt-hybridkubernetes \
python3dist-azure-mgmt-hybridkubernetes"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
