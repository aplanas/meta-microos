SUMMARY = "Microsoft Azure Paloaltonetworksngfw Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Paloaltonetworksngfw Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b2"

RPM_NAME = "python39-azure-mgmt-paloaltonetworksngfw-1.0.0~b2-1.1.noarch.rpm"
RPM_HASH = "96375468537e8da2df4fe8af3f614f926e50ab182269d6d0da5c62c578f61524e4ddea81e9c7e759f7c5b4b3e67813049d52147dabdc556a5f842830512c24a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-paloaltonetworksngfw) \
python39-azure-mgmt-paloaltonetworksngfw \
python3dist(azure-mgmt-paloaltonetworksngfw)"

RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) \
python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
