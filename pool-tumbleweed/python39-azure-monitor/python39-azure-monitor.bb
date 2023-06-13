SUMMARY = "Microsoft Azure Monitor Client Library"
DESCRIPTION = "This is the Microsoft Azure Monitor Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.3, 3.4 and 3.5."
LICENSE = "MIT"

PV = "0.3.1"

RPM_NAME = "python39-azure-monitor-0.3.1-3.11.noarch.rpm"
RPM_HASH = "8fb12c9581db33611df64588faedbc6ad51a28048644ea99f9f9930d12e66a551cc03e13ac6c817c5221d7d60e5b98e542f9956c8c3bb06c47718596ef9540a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-monitor) \
python39-azure-monitor \
python3dist(azure-monitor)"

RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-nspkg \
python39-msrestazure"

inherit rpm
