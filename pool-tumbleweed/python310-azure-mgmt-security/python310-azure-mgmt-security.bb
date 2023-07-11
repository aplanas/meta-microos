SUMMARY = "Microsoft Azure Security Center Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Security Center Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "python310-azure-mgmt-security-5.0.0-1.2.noarch.rpm"
RPM_HASH = "d316cea5fdb53ed69cfe4ae33d331ada504eb3caf25c64ce24b21aa215219b2634e6a4ca389922788c1cf8e5f40889b3d3e1a83543339c6e3e1db28ef9df072b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-security \
python310-azure-mgmt-security \
python3dist-azure-mgmt-security"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
