SUMMARY = "Microsoft Azure Application Insights Client Library"
DESCRIPTION = "This is the Microsoft Azure Application Insights Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python311-azure-applicationinsights-0.1.1-2.3.noarch.rpm"
RPM_HASH = "3be7ed4a970a92cae7b00ad317d258e81c0737b17f46e2a30c9e8c0f77475053c616426ffdf92e47e0e00528947758b1bf668ac4054b8d500ba0ba9126acb1b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-applicationinsights) \
python311-azure-applicationinsights \
python3dist(azure-applicationinsights)"

RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-nspkg \
python311-msrest"

inherit rpm
