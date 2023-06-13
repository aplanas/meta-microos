SUMMARY = "Microsoft Azure Web Apps Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Web Apps Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "7.1.0"

RPM_NAME = "python310-azure-mgmt-web-7.1.0-1.1.noarch.rpm"
RPM_HASH = "3480ebdc61c60dcdb3450f3a5c923e2a386db0b8da1f257d56f128d0366dcb30b3270b3ec8e40a502e7680dea73c5d7e0d5e2cdf17f43be52e922210708681c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-web \
python3.10dist(azure-mgmt-web) \
python310-azure-mgmt-web \
python3dist(azure-mgmt-web)"

RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) \
python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
