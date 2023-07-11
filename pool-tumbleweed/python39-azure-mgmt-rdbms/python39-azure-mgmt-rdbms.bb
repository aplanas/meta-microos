SUMMARY = "Microsoft Azure RDBMS Management Client Library"
DESCRIPTION = "This is the Microsoft Azure RDBMS Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.2.0b10"

RPM_NAME = "python39-azure-mgmt-rdbms-10.2.0b10-1.1.noarch.rpm"
RPM_HASH = "bfae742ca9bdcfe70f6bbf60a6615cc12a09debaf44d0fc6bf6c1619cbf68a9a25df15bebe0b58ed6b3dc09c9cde2848380689c9d13e2fa9ecbbdb3bf432115f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-rdbms \
python39-azure-mgmt-rdbms \
python3dist-azure-mgmt-rdbms"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
