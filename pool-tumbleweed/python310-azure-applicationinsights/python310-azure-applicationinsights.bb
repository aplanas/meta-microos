SUMMARY = "Microsoft Azure Application Insights Client Library"
DESCRIPTION = "This is the Microsoft Azure Application Insights Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python310-azure-applicationinsights-0.1.1-2.5.noarch.rpm"
RPM_HASH = "0f05898702dcd48e9b3c7a2923c2baf3886de0743c8964481dd82f509c3606a08a0c04f244982345c00b4229a3df8afa6f8432f4cccd408847ea57b1027f0033"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-applicationinsights \
python310-azure-applicationinsights \
python3dist-azure-applicationinsights"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-nspkg \
python310-msrest"

inherit rpm
