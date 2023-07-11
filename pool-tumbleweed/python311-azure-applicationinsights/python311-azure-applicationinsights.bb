SUMMARY = "Microsoft Azure Application Insights Client Library"
DESCRIPTION = "This is the Microsoft Azure Application Insights Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python311-azure-applicationinsights-0.1.1-2.5.noarch.rpm"
RPM_HASH = "f474ae51bd2acefb70831d821d94c8ee310847eca402b9836e1872d25d0f2a06091279d236da563a256973938c6f17e65efecbc96d6e11ce855d1eff4c08e0b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-applicationinsights \
python3.11dist-azure-applicationinsights \
python311-azure-applicationinsights \
python3dist-azure-applicationinsights"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-nspkg \
python311-msrest"

inherit rpm
