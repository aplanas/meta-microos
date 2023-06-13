SUMMARY = "Microsoft Azure Storage Client Library"
DESCRIPTION = "This is the Microsoft Azure Storage Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.3, 3.4, 3.5 and 3.6."
LICENSE = "Apache-2.0"

PV = "0.36.0"

RPM_NAME = "python310-azure-storage-0.36.0-3.14.noarch.rpm"
RPM_HASH = "56f2e46f25fb19ac60b3bb01563b19e3e2eb4fa2a862a11c03c89bb76140447f03a8aa63b9a68c171433121490d78411018dae023cd79acc21d1d4c3ae3fa849"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-sdk-storage \
python3-azure-storage \
python3.10dist(azure-storage) \
python310-azure-sdk-storage \
python310-azure-storage \
python3dist(azure-storage)"

RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-nspkg \
python310-cryptography \
python310-python-dateutil \
python310-requests"

inherit rpm
