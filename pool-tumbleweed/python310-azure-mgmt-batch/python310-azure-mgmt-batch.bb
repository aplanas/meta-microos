SUMMARY = "Microsoft Azure Batch Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Batch Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "17.1.0"

RPM_NAME = "python310-azure-mgmt-batch-17.1.0-1.1.noarch.rpm"
RPM_HASH = "249353f7ebcc362f06ff240fb54d18753dbc447c2516cf1c8ad248ab941288a6a73acc469e85c0a4fc84c7208434b414b1db69b39dc4f8e4379eaf73e832c35d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-batch \
python310-azure-mgmt-batch \
python3dist-azure-mgmt-batch"

RDEPENDS:${PN} += "-python310-azure-common >= 1.1 with python310-azure-common < 2.0.0 \
-python310-azure-mgmt-core >= 1.3.2 with python310-azure-mgmt-core < 2.0.0 \
-python310-isodate >= 0.6.1 with python310-isodate < 1.0.0 \
python-abi \
python310-azure-mgmt-nspkg \
python310-azure-nspkg"

inherit rpm
