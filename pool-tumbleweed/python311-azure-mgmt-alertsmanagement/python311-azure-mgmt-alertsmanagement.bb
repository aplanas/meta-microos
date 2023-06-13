SUMMARY = "Microsoft Azure Alerts Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Alerts Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-alertsmanagement-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "415722fdbfd73ce0d0d65eabb273999f34c0f5ed25565a1d1920055ff8b2b787f75a36350d34ed86015c9a33c433181bb5493ba74a7a548193ce550b673d899e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-alertsmanagement) \
python311-azure-mgmt-alertsmanagement \
python3dist(azure-mgmt-alertsmanagement)"

RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
