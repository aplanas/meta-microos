SUMMARY = "Microsoft Azure Compute Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Compute Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "30.0.0"

RPM_NAME = "python39-azure-mgmt-compute-30.0.0-1.1.noarch.rpm"
RPM_HASH = "9d6b705f90d93d021c21791f85af8473a8a8575455ce1be3ae8b9197289f59178a01ac2f431790fa3346da3e55c060ec1d6a25a118c5203a1075d7d0a6e15975"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-compute) \
python39-azure-mgmt-compute \
python3dist(azure-mgmt-compute)"

RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) \
python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
