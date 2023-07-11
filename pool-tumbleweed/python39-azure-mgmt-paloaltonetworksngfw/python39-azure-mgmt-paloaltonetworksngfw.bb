SUMMARY = "Microsoft Azure Paloaltonetworksngfw Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Paloaltonetworksngfw Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b2"

RPM_NAME = "python39-azure-mgmt-paloaltonetworksngfw-1.0.0~b2-1.2.noarch.rpm"
RPM_HASH = "631965ff558f8021b6f2ae15b92cd073d79c932a4594de0e77ff92ecd5a6074bc4e31ce31faabe1abc3c34fb8ef6c7003e06cea7ac8cdf75c46914f256c4d708"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-paloaltonetworksngfw \
python39-azure-mgmt-paloaltonetworksngfw \
python3dist-azure-mgmt-paloaltonetworksngfw"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
