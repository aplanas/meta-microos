SUMMARY = "Microsoft Azure Monitor Client Library"
DESCRIPTION = "This is the Microsoft Azure Monitor Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "6.0.2"

RPM_NAME = "python310-azure-mgmt-monitor-6.0.2-1.1.noarch.rpm"
RPM_HASH = "30d2da92c33a91754e399bfdf9c2516d05e48f15ed4cebf6aa9075e203f77fe26061803fc9f2a22bac0931538a781d24d9759ba6460b0703bc946f7bef8c8319"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-monitor \
python310-azure-mgmt-monitor \
python3dist-azure-mgmt-monitor"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
