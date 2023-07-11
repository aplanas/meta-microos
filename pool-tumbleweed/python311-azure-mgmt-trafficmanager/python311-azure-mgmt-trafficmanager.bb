SUMMARY = "Microsoft Azure Traffic Manager Client Library"
DESCRIPTION = "This is the Microsoft Azure Traffic Manager Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-azure-mgmt-trafficmanager-1.1.0-1.1.noarch.rpm"
RPM_HASH = "d50d66fa5da6979b9dbf6eb29be392aeb4ff770b2eccc4d8e770a96d79c8b1f08f331ffa96c15156cb9166011d0884700a21b955a8e33046e39b8e62656b12f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-trafficmanager \
python3.11dist-azure-mgmt-trafficmanager \
python311-azure-mgmt-trafficmanager \
python3dist-azure-mgmt-trafficmanager"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
