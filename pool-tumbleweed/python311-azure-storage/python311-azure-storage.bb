SUMMARY = "Microsoft Azure Storage Client Library"
DESCRIPTION = "This is the Microsoft Azure Storage Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.3, 3.4, 3.5 and 3.6."
LICENSE = "Apache-2.0"

PV = "0.36.0"

RPM_NAME = "python311-azure-storage-0.36.0-3.14.noarch.rpm"
RPM_HASH = "d24c68969c1ef74cef6e42a01631ec70619b0763b37c4df54f86996202a6f8a675ed3725b2c22920aea1bc79c12f38e9dfd39a1abfbb448ee4faf74d50a27c42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-storage) \
python311-azure-sdk-storage \
python311-azure-storage \
python3dist(azure-storage)"

RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-nspkg \
python311-cryptography \
python311-python-dateutil \
python311-requests"

inherit rpm
