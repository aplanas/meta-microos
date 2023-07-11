SUMMARY = "Microsoft Azure Loadtestservice Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Loadtestservice Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-loadtestservice-1.0.0.0-1.4.noarch.rpm"
RPM_HASH = "93f3eace0a3fa080bea447c62c524aed4b831ea201d4f7d0a39cdbd5405ddb3ed3ede1b5df027f83e754443b934304e5435e0fc3ee94f7e394e208b9103a5102"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-loadtestservice \
python39-azure-mgmt-loadtestservice \
python3dist-azure-mgmt-loadtestservice"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
