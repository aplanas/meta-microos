SUMMARY = "Microsoft Azure Container Service Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Container Service Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "23.0.0"

RPM_NAME = "python39-azure-mgmt-containerservice-23.0.0-1.1.noarch.rpm"
RPM_HASH = "a93db128f82fb1819002495dcf2b5a95d64f4e4703f46a7c5a75547891d08dfc156a32d6d3696b29c35dcbe2021111638af623799c1ebcffb98ca2f10259ed80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-containerservice \
python39-azure-mgmt-containerservice \
python3dist-azure-mgmt-containerservice"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
