SUMMARY = "Microsoft Azure Compute Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Compute Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "30.1.0"

RPM_NAME = "python311-azure-mgmt-compute-30.1.0-1.1.noarch.rpm"
RPM_HASH = "39dac5c638fc63c08a821daaaa9e33a76584de0ef5f962824670fffef1ccd67cbecdcf5c1f0862e1cc35cbb7fdf8a848189bb3b5f898eac335debe790c808cbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-compute \
python3.11dist-azure-mgmt-compute \
python311-azure-mgmt-compute \
python3dist-azure-mgmt-compute"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
