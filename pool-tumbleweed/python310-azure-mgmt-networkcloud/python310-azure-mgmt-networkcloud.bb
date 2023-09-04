SUMMARY = "Microsoft Azure Networkcloud Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Networkcloud Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-mgmt-networkcloud-1.0.0-1.1.noarch.rpm"
RPM_HASH = "e96ebc2f4bcd274c359d981fa260f0a9cf550e6c6ea5ddba45007f9c0b4e28d8bdab60f85c80e690ba203513ef588be04d28a571bae4fd08cf7b9cb72b6171ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-networkcloud \
python310-azure-mgmt-networkcloud \
python3dist-azure-mgmt-networkcloud"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
