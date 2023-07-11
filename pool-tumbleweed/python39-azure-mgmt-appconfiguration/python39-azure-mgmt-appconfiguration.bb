SUMMARY = "Microsoft Azure App Configuration Management Client Library"
DESCRIPTION = "This is the Microsoft Azure App Configuration Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python39-azure-mgmt-appconfiguration-3.0.0-1.3.noarch.rpm"
RPM_HASH = "35fd8443ec9c6ffc03bd8bbe0894291236be4c816b6682e0b6f08219ec677316c26c08e8e21d161cde6e5c15def4401a868f1ba97e31fb8f73296e976f8041c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-appconfiguration \
python39-azure-mgmt-appconfiguration \
python3dist-azure-mgmt-appconfiguration"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
