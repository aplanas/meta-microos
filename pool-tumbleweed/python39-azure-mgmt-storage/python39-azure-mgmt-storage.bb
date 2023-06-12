SUMMARY = "Microsoft Azure Storage Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Storage Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "21.0.0"

RPM_NAME = "python39-azure-mgmt-storage-21.0.0-1.3.noarch.rpm"
RPM_HASH = "1e70d7a8a0fa9c9ebdf9c47ee5e1e4531abf264f244f1f1ac73ea58bfbb280510dd5ab6dd4a5c5711ce73dd4c15c46ca72341bcbda930ed28a6e72381e145b47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-storage) \
python39-azure-mgmt-storage \
python3dist(azure-mgmt-storage)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) \
python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
