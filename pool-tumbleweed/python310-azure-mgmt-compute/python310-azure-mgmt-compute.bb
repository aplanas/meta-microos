SUMMARY = "Microsoft Azure Compute Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Compute Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "30.1.0"

RPM_NAME = "python310-azure-mgmt-compute-30.1.0-1.1.noarch.rpm"
RPM_HASH = "d6ae7836623a28faa94384cb126cf12b78dd30b8f5ce0e33bde09a7dbd6f7c25854b5ab70c8983cfab9efe06ff2bf5a2ad5d471a982c1ab157b00e68447b2100"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-compute \
python310-azure-mgmt-compute \
python3dist-azure-mgmt-compute"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
