SUMMARY = "Microsoft Azure Loadtestservice Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Loadtestservice Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-loadtestservice-1.0.0.0-1.4.noarch.rpm"
RPM_HASH = "4f7a13de26b7eed2b515094d5af02bdd0d99922aa702e0f03e7d412531c5f2182d93fe2d6a6ca7558b57f02b4e6662ab3180637521d4b68f40d48d18e95ca52f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-loadtestservice \
python310-azure-mgmt-loadtestservice \
python3dist-azure-mgmt-loadtestservice"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
