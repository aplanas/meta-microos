SUMMARY = "Microsoft Azure Mixed Reality Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Mixed Reality Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python39-azure-mgmt-mixedreality-1.0.0b1-2.9.noarch.rpm"
RPM_HASH = "8b5d65b9d6f81a4b508a2a518225b54608c5e7f9cce9a8267373a59f1b16a0e4a40b904ef9ee29a9f31c7ef549866fa78bad889b5765d70181514cbf9d09bdbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-mixedreality \
python39-azure-mgmt-mixedreality \
python3dist-azure-mgmt-mixedreality"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
