SUMMARY = "Microsoft Azure Paloaltonetworksngfw Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Paloaltonetworksngfw Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b2"

RPM_NAME = "python311-azure-mgmt-paloaltonetworksngfw-1.0.0~b2-1.2.noarch.rpm"
RPM_HASH = "a1aa9b56168ff026e153f8895f4026cc53e9f73fd1f90c0b1899ff87391f4cc86754300642b8cb0dcd1bf595ae9aa7a9a8e095da31198fdda99d9dc03a61aded"
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
