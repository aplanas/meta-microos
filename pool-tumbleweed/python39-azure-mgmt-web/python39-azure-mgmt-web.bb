SUMMARY = "Microsoft Azure Web Apps Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Web Apps Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "7.1.0"

RPM_NAME = "python39-azure-mgmt-web-7.1.0-1.2.noarch.rpm"
RPM_HASH = "1706ddb2ce56f3c33a84f69e609752c29c229cf96ef986ca40f169125c0670ad1edf20ab52888eefedc80318328e1fc20fb0ba0a4987bb5263dd0ea76de5b016"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-web \
python39-azure-mgmt-web \
python3dist-azure-mgmt-web"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
