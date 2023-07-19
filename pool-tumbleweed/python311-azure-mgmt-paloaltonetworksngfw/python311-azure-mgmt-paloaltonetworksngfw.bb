SUMMARY = "Microsoft Azure Paloaltonetworksngfw Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Paloaltonetworksngfw Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-mgmt-paloaltonetworksngfw-1.0.0-1.1.noarch.rpm"
RPM_HASH = "c1fadf477297e63aaa3b58562ca180350c16fd66fbf3890cec8accd206e2e1c1d3b55e357cd48d995a30609930c867ee38221a84beae23c8896725730fd0e9b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-paloaltonetworksngfw \
python3.11dist-azure-mgmt-paloaltonetworksngfw \
python311-azure-mgmt-paloaltonetworksngfw \
python3dist-azure-mgmt-paloaltonetworksngfw"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
