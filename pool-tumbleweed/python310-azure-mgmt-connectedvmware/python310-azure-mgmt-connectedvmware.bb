SUMMARY = "Microsoft Azure Connectedvmware Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Connectedvmware Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0b3"

RPM_NAME = "python310-azure-mgmt-connectedvmware-1.0.0b3-1.4.noarch.rpm"
RPM_HASH = "83f44457fdf8ccbd83980bfcd997e17f4477e0110d93a2879bbc1d5dc8e208732c7c09ae1485c769f98743a69bd3580a66f2ae448129d58e77db47150129ae8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-connectedvmware \
python310-azure-mgmt-connectedvmware \
python3dist-azure-mgmt-connectedvmware"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
