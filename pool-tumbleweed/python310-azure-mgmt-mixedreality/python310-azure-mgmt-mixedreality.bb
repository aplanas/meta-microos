SUMMARY = "Microsoft Azure Mixed Reality Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Mixed Reality Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python310-azure-mgmt-mixedreality-1.0.0b1-2.9.noarch.rpm"
RPM_HASH = "7c03977145330baddd2a562e2a8d163ebff5268480d46688550a6fcd3a1ac72349fd5a8c1e6178ab876f052cbc86f6985128eb3032bad2b571f2fbd6ea6dc2c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-mixedreality \
python310-azure-mgmt-mixedreality \
python3dist-azure-mgmt-mixedreality"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
