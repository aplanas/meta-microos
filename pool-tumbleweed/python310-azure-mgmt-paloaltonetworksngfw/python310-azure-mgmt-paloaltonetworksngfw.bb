SUMMARY = "Microsoft Azure Paloaltonetworksngfw Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Paloaltonetworksngfw Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-mgmt-paloaltonetworksngfw-1.0.0-1.1.noarch.rpm"
RPM_HASH = "ff54cd86583702a544c4c32c1cf42b9d6a3d616d9b595582868b79220dd45e2d03767702ef434efd55403767525321205ca273b12a6184870997b2f6098676f9"
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
