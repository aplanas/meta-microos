SUMMARY = "Microsoft Azure Authorization Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Authorization Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python310-azure-mgmt-authorization-3.0.0-1.3.noarch.rpm"
RPM_HASH = "b7658eea15fdb9ab43512c24e145141b5bb9eedeae8f09048c02b0671798f30a1d02f89c2f5a3e19bf549e79d550a7c0a522121000d1b4811c495251f1e1e7a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-authorization \
python3.10dist(azure-mgmt-authorization) \
python310-azure-mgmt-authorization \
python3dist(azure-mgmt-authorization)"

RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-nspkg \
python310-msrest"

inherit rpm
