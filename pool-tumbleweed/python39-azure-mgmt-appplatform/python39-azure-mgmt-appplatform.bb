SUMMARY = "Microsoft Azure MyService Management Client Library"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "python39-azure-mgmt-appplatform-8.0.0-1.2.noarch.rpm"
RPM_HASH = "3045e18af0719e37c86d955ea437b1c6932cee8bc855c7ae55860e138f7538d58d325d95ded2088f5005d0c04e675d6592d56e34df8a4b3c9c31069bbb0d5879"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-appplatform \
python39-azure-mgmt-appplatform \
python3dist-azure-mgmt-appplatform"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
