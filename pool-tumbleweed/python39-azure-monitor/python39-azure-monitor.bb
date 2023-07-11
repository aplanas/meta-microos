SUMMARY = "Microsoft Azure Monitor Client Library"
DESCRIPTION = "This is the Microsoft Azure Monitor Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.3, 3.4 and 3.5."
LICENSE = "MIT"

PV = "0.3.1"

RPM_NAME = "python39-azure-monitor-0.3.1-3.12.noarch.rpm"
RPM_HASH = "7c89a9e5bea876cb85764c27a07628f9bd387256c17f0544189dbd5a91968fd7ffa83e39830994c384ebe9f81eb91c21bad54c0f0f54c9d2dc457ea981f9b05b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-monitor \
python39-azure-monitor \
python3dist-azure-monitor"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-nspkg \
python39-msrestazure"

inherit rpm
