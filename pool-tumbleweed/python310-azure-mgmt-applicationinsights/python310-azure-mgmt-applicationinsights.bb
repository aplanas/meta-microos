SUMMARY = "Microsoft Azure Application Insights Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Application Insights Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python310-azure-mgmt-applicationinsights-4.0.0-1.1.noarch.rpm"
RPM_HASH = "8aed3ca2fe13f98df39552204919c53d0eba8bc6e113a8679c36ac0599e9a2ee8e17c7a4bf353853773b38e716571974d46c1e71aceeefa44fd5d48822cdc57a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-applicationinsights \
python3.10dist-azure-mgmt-applicationinsights \
python310-azure-mgmt-applicationinsights \
python3dist-azure-mgmt-applicationinsights"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
