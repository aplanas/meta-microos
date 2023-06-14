SUMMARY = "Microsoft Azure Monitor Client Library"
DESCRIPTION = "This is the Microsoft Azure Monitor Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "6.0.1"

RPM_NAME = "python311-azure-mgmt-monitor-6.0.1-1.1.noarch.rpm"
RPM_HASH = "4692ac971a53df688fab7eb98942fd8f33c2646180fb06847be511f8a475fbde5d940bf5adcf128a8ebf6dffa2e45e625fd92b40018db27b6660033e3ceb90be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-monitor \
python311-azure-mgmt-monitor \
python3dist-azure-mgmt-monitor"

RDEPENDS:${PN} += "-python311-typing-extensions >= 4.3.0 if python311-base < 3.8 \
python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
