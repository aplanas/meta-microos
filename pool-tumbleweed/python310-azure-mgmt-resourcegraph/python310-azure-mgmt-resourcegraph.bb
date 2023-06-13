SUMMARY = "Microsoft Azure Resource Graph Client Library"
DESCRIPTION = "This is the Microsoft Azure Resource Graph Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "python310-azure-mgmt-resourcegraph-8.0.0-1.8.noarch.rpm"
RPM_HASH = "246b8f2662cbb4fc4837b05a01273a3deb208185026903748376cab33002a1ba2a99cfb921c3e28120f89311ca6789d09ed228ba427f3ffdc7ef2522095d1e07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-resourcegraph \
python3.10dist(azure-mgmt-resourcegraph) \
python310-azure-mgmt-resourcegraph \
python3dist(azure-mgmt-resourcegraph)"

RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
