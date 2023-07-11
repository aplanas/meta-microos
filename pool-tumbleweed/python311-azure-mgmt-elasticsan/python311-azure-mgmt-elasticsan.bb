SUMMARY = "Microsoft Azure Elasticsan Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Elasticsan Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python311-azure-mgmt-elasticsan-1.0.0b1-1.4.noarch.rpm"
RPM_HASH = "ade040f52c09b196c2adb4c5c4d1705e5646db684bb0fd5c79755cd7f916197040040e564fdad430c28b9e0fb99bdb9757f0942123c1079f0939f9ff8fe7e078"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-elasticsan \
python3.11dist-azure-mgmt-elasticsan \
python311-azure-mgmt-elasticsan \
python3dist-azure-mgmt-elasticsan"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
