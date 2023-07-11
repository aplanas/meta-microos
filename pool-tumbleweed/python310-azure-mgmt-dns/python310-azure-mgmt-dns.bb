SUMMARY = "Microsoft Azure DNS Management Client Library"
DESCRIPTION = "This is the Microsoft Azure DNS Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "8.1.0"

RPM_NAME = "python310-azure-mgmt-dns-8.1.0-1.1.noarch.rpm"
RPM_HASH = "ed5d17b012f94e6b70b264fbb7fee959a03d4b98649884077886d4e0b65017f9d29a068012ebf8b37424d9057c5fbd7773bca5bb6b8ff7f725758f2826dbecbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-dns \
python310-azure-mgmt-dns \
python3dist-azure-mgmt-dns"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
