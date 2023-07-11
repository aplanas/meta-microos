SUMMARY = "Microsoft Azure MyService Management Client Library"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "python310-azure-mgmt-appplatform-8.0.0-1.2.noarch.rpm"
RPM_HASH = "e6a7c27383d2136d49ab0128cea3748404da2f9f3e6ff1eaa6b9f1878605b97a1bd12119117a23538b7b20a6eb8cf679864efb357b778e2408fbb3b41acc5e84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-appplatform \
python310-azure-mgmt-appplatform \
python3dist-azure-mgmt-appplatform"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
