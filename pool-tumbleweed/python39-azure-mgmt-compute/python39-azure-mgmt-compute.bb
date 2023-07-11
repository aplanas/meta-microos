SUMMARY = "Microsoft Azure Compute Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Compute Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "30.0.0"

RPM_NAME = "python39-azure-mgmt-compute-30.0.0-1.2.noarch.rpm"
RPM_HASH = "eb0723ab4b7169b97088b0480177197f928b5e1d256d42967d5d72ced605d6571b8cb6a9c16c8fc65939da4578da50e84c267565d331371b8a0b3048b5a55a00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-compute \
python39-azure-mgmt-compute \
python3dist-azure-mgmt-compute"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
