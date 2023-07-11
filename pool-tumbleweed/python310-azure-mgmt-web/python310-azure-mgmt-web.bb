SUMMARY = "Microsoft Azure Web Apps Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Web Apps Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "7.1.0"

RPM_NAME = "python310-azure-mgmt-web-7.1.0-1.2.noarch.rpm"
RPM_HASH = "8814ff92ca6f9ca68e037af21cbc4e2f945f2c57341410a1838a6c46ee6e7e7c843cb87d7783c4bfb5df509996b360ccad80ceaffe72a2d53585aec22f8eb2d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-web \
python310-azure-mgmt-web \
python3dist-azure-mgmt-web"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
