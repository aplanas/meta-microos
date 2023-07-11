SUMMARY = "Microsoft Azure Paloaltonetworksngfw Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Paloaltonetworksngfw Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b2"

RPM_NAME = "python310-azure-mgmt-paloaltonetworksngfw-1.0.0~b2-1.2.noarch.rpm"
RPM_HASH = "0d6602ae62e08a4aa7cf3d383081bc0b33687756e964c3e19dfe64411d0d9b6c890e5cf9e04da9cef2a8a2c1529b0cb2c408709477c0f10e9bba1a1621731d8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-paloaltonetworksngfw \
python310-azure-mgmt-paloaltonetworksngfw \
python3dist-azure-mgmt-paloaltonetworksngfw"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
