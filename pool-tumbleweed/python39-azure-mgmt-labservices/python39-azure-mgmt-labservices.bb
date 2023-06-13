SUMMARY = "Microsoft Azure Lab Services Client Library"
DESCRIPTION = "This is the Microsoft Azure Lab Services Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-azure-mgmt-labservices-2.0.0-1.3.noarch.rpm"
RPM_HASH = "5904092a14653763baf9267c3b2267572017be828f2aae0e91f5e12755fc47c2b8f642b2c7b0a20370660576154e779539a2480e057ea2f3e3ffe493afdec90d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-labservices) \
python39-azure-mgmt-labservices \
python3dist(azure-mgmt-labservices)"

RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
