SUMMARY = "Microsoft Azure DNS Management Client Library"
DESCRIPTION = "This is the Microsoft Azure DNS Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "8.0.0.0"

RPM_NAME = "python311-azure-mgmt-dns-8.0.0.0-1.3.noarch.rpm"
RPM_HASH = "da6e42277b0018f750046350e0c22c470f3aba3de47ec0257538eb260b07f5f185c46ea451276f245e65e6fb6312fe1363b39af63dad0854de720ce8588ad6fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-dns) \
python311-azure-mgmt-dns \
python3dist(azure-mgmt-dns)"
RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
