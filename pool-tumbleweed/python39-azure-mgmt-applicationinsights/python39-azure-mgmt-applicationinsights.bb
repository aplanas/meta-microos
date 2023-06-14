SUMMARY = "Microsoft Azure Application Insights Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Application Insights Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python39-azure-mgmt-applicationinsights-4.0.0-1.1.noarch.rpm"
RPM_HASH = "32027c76f7d80c190b48e1af8e5137e9e25bd4c80dca14ab047ce046b13c563ac9ab596f31f787fe4b11c9b67c48b0953f40a89cb3230944a303d84b135d85bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-applicationinsights \
python39-azure-mgmt-applicationinsights \
python3dist-azure-mgmt-applicationinsights"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
