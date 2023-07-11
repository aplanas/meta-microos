SUMMARY = "Microsoft Azure Container Service Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Container Service Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "24.0.0"

RPM_NAME = "python311-azure-mgmt-containerservice-24.0.0-1.1.noarch.rpm"
RPM_HASH = "2355724fd69d9fbe3c123643112217b5f9809d6178db5c1433bd89b191042575ed87cd04a7ba39f7fa81c7a9130d00478cf9826504a6941a33503c6a4e089399"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-containerservice \
python3.11dist-azure-mgmt-containerservice \
python311-azure-mgmt-containerservice \
python3dist-azure-mgmt-containerservice"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
