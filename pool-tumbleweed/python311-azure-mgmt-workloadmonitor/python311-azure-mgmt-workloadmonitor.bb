SUMMARY = "Microsoft Azure Workloadmonitor Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Workloadmonitor Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0~b4"

RPM_NAME = "python311-azure-mgmt-workloadmonitor-1.0.0~b4-1.2.noarch.rpm"
RPM_HASH = "30ad396f7b433ba448c700be8f1ece21d481f69a15a2494cc88cbf1b46c7cce04e3a8e7261ad57b6711df099c5e60c131d686d2a40cbb9d7bc4c47791e898ef6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-workloadmonitor \
python311-azure-mgmt-workloadmonitor \
python3dist-azure-mgmt-workloadmonitor"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
