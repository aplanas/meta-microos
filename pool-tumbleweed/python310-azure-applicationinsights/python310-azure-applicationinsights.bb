SUMMARY = "Microsoft Azure Application Insights Client Library"
DESCRIPTION = "This is the Microsoft Azure Application Insights Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python310-azure-applicationinsights-0.1.1-2.3.noarch.rpm"
RPM_HASH = "2297ba93cb33cd8290516e644684308c0ae2f30a43f21eb0f880a3cb041de670f0045bffa3537c167ed3089b3f353d009a940bbed1ed1cf218657c2f6ebad353"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-applicationinsights \
python3.10dist-azure-applicationinsights \
python310-azure-applicationinsights \
python3dist-azure-applicationinsights"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-nspkg \
python310-msrest"

inherit rpm
