SUMMARY = "Microsoft Azure Confluent Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Confluent Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-confluent-1.0.0.0-1.11.noarch.rpm"
RPM_HASH = "06db0a79e81a89c72dda60bc5934a29314cd4680a74232192c08153ad8080694d9c4ef73b89b5e5a76a775b43df469a105a1f1c1fcf35fd93e581676858c66a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-confluent \
python3.11dist-azure-mgmt-confluent \
python311-azure-mgmt-confluent \
python3dist-azure-mgmt-confluent"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
