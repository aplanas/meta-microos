SUMMARY = "Microsoft Azure Mixed Reality Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Mixed Reality Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python39-azure-mgmt-mixedreality-1.0.0b1-2.8.noarch.rpm"
RPM_HASH = "323d99aa4a172afa6520442b86326446f093ae4f2538fed65d700afa6672d01e4f2aa7988cb07e2b4363894c513930a03c9d7733cd12ebce444fba62f17621b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-mixedreality) \
python39-azure-mgmt-mixedreality \
python3dist(azure-mgmt-mixedreality)"
RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
