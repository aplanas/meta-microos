SUMMARY = "Microsoft Azure Confluent Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Confluent Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-confluent-1.0.0.0-1.10.noarch.rpm"
RPM_HASH = "dc16cf88d7108297ffd91a017b5a11b11260a0dbec6d57575d1ed3db8f10e88d4388d7311e55105c05cb6fc979adf0ff9f7b8a479cc1e02c5eb6f3d08fe8d0b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-confluent) \
python39-azure-mgmt-confluent \
python3dist(azure-mgmt-confluent)"
RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
