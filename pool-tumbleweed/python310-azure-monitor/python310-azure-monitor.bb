SUMMARY = "Microsoft Azure Monitor Client Library"
DESCRIPTION = "This is the Microsoft Azure Monitor Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.3, 3.4 and 3.5."
LICENSE = "MIT"

PV = "0.3.1"

RPM_NAME = "python310-azure-monitor-0.3.1-3.12.noarch.rpm"
RPM_HASH = "06243a73a9a84c0cc8e64c57b522ffe0ab050d706236fffedcb9944773c825a76ad99c5667b848d6582b233d5e9292b13d007d951df442062f1f745b59e50822"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-monitor \
python310-azure-monitor \
python3dist-azure-monitor"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-nspkg \
python310-msrestazure"

inherit rpm
