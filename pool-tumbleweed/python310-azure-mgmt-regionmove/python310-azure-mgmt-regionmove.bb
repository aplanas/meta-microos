SUMMARY = "Microsoft Azure MyService Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python310-azure-mgmt-regionmove-1.0.0b1-2.12.noarch.rpm"
RPM_HASH = "a90afa170dacfddf5268e4a39ecd1531a249ac0c1b31c904359489c628ba55034c768d9b65226563622a86a60cabeadb30b84a4c7cc5528fe516af2b17282695"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-regionmove \
python310-azure-mgmt-regionmove \
python3dist-azure-mgmt-regionmove"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest \
python310-msrestazure"

inherit rpm
