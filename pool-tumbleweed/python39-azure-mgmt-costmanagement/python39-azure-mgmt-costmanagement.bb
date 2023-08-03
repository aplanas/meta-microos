SUMMARY = "Microsoft Azure Cost Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Cost Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.0.1"

RPM_NAME = "python39-azure-mgmt-costmanagement-4.0.1-1.1.noarch.rpm"
RPM_HASH = "8ca0591e66094d13bd23241dee2b77ff68badddce00a9582fc35baed04f8db5d755a82b85359640ce8b16d7c0cf53bd99a93e2c785bc5a6295ec0e98d22f919c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-costmanagement \
python39-azure-mgmt-costmanagement \
python3dist-azure-mgmt-costmanagement"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
