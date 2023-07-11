SUMMARY = "Microsoft Azure Quantum Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Quantum Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b3"

RPM_NAME = "python39-azure-mgmt-quantum-1.0.0b3-1.4.noarch.rpm"
RPM_HASH = "92f8134778979814384f54043baf197133f5d8f452d404601deff683d1477fd8e8b7f90fb232d0337b06644a069262eecd25d6181ebd72613d58bec77db49667"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-quantum \
python39-azure-mgmt-quantum \
python3dist-azure-mgmt-quantum"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
