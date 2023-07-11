SUMMARY = "Microsoft Azure Container Service Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Container Service Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "24.0.0"

RPM_NAME = "python310-azure-mgmt-containerservice-24.0.0-1.1.noarch.rpm"
RPM_HASH = "1a21b80239d5be0d74ea3364380ba397f1e229e45d1b2862052d19e591f0a9d350d5d8976afb462454e5351def438fd0471339c6dce08bac3ed77d9686037aff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-containerservice \
python310-azure-mgmt-containerservice \
python3dist-azure-mgmt-containerservice"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
