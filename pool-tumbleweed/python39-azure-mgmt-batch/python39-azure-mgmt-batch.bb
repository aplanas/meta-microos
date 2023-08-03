SUMMARY = "Microsoft Azure Batch Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Batch Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "17.1.0"

RPM_NAME = "python39-azure-mgmt-batch-17.1.0-1.1.noarch.rpm"
RPM_HASH = "206dd0f59d336adf8bfbab9db5db173e87e39f99944ce9ea14d32d2cf2497abd57982018f51d3908c72bfde073e9509867d280f677d715149241ae5266423da6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-batch \
python39-azure-mgmt-batch \
python3dist-azure-mgmt-batch"

RDEPENDS:${PN} += "-python39-azure-common >= 1.1 with python39-azure-common < 2.0.0 \
-python39-azure-mgmt-core >= 1.3.2 with python39-azure-mgmt-core < 2.0.0 \
-python39-isodate >= 0.6.1 with python39-isodate < 1.0.0 \
python-abi \
python39-azure-mgmt-nspkg \
python39-azure-nspkg"

inherit rpm
