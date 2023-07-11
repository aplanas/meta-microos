SUMMARY = "Microsoft Azure CDN Management Client Library"
DESCRIPTION = "This is the Microsoft Azure CDN Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "12.0.0"

RPM_NAME = "python311-azure-mgmt-cdn-12.0.0-1.7.noarch.rpm"
RPM_HASH = "90d52b1624f662a2fdf6240113250317eb7214be89bdbb296c68da483451c10c8e23994e78cba630bf15ad248be2fb1aa2c5cf963c17d33bb3696c486a0353f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-cdn \
python3.11dist-azure-mgmt-cdn \
python311-azure-mgmt-cdn \
python3dist-azure-mgmt-cdn"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
