SUMMARY = "Microsoft Azure Quantum Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Quantum Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b3"

RPM_NAME = "python310-azure-mgmt-quantum-1.0.0b3-1.3.noarch.rpm"
RPM_HASH = "2ee2d1f1d058b058b037598f24153181d758c453255c736bfa9f1724147c4d67e435801482ea66fab0506dad6c0637f73ddbe5cc9996bc31573214535b1231c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-quantum \
python3.10dist-azure-mgmt-quantum \
python310-azure-mgmt-quantum \
python3dist-azure-mgmt-quantum"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
