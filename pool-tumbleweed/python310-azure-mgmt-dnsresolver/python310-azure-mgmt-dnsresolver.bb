SUMMARY = "Microsoft Azure Dnsresolver Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Dnsresolver Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-mgmt-dnsresolver-1.0.0-1.3.noarch.rpm"
RPM_HASH = "3ea0dd5bd75d22c568eb7c9b39072d689c1c4e96103d8ec16f34281f2d6d9f3dedb728b0baced685cc7ac2acdf0540bd660d1fc6e806a2f0e5c5d272513d72a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-dnsresolver \
python3.10dist(azure-mgmt-dnsresolver) \
python310-azure-mgmt-dnsresolver \
python3dist(azure-mgmt-dnsresolver)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
