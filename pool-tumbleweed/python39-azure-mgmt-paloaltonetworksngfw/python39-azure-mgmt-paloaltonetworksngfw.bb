SUMMARY = "Microsoft Azure Paloaltonetworksngfw Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Paloaltonetworksngfw Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-mgmt-paloaltonetworksngfw-1.0.0-1.1.noarch.rpm"
RPM_HASH = "5ec0056108803767072f27e2732798dc72889d2827c79fb0ade38daa5cb3dde28e258fe36c20a5680bb47fe903a7a7c7e2265a0b55b7ec0307144184331eacba"
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
