SUMMARY = "Microsoft Azure Monitor Client Library"
DESCRIPTION = "This is the Microsoft Azure Monitor Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.3, 3.4 and 3.5."
LICENSE = "MIT"

PV = "0.3.1"

RPM_NAME = "python310-azure-monitor-0.3.1-3.11.noarch.rpm"
RPM_HASH = "fe45f7abecc9355f0982705e2376e80349e0a9efdacd783828068950e59273f63fb4f55fcbeb11a8273456bc29dda0c21a7863e000fe7facf8d54ba670e4bd1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-monitor \
python3.10dist-azure-monitor \
python310-azure-monitor \
python3dist-azure-monitor"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-nspkg \
python310-msrestazure"

inherit rpm
