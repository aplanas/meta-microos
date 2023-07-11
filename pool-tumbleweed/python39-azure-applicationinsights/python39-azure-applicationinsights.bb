SUMMARY = "Microsoft Azure Application Insights Client Library"
DESCRIPTION = "This is the Microsoft Azure Application Insights Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python39-azure-applicationinsights-0.1.1-2.5.noarch.rpm"
RPM_HASH = "4bceea5dda890566e88514aee8ca5f59c6d6e0681bf94d761bffb8fc191998792867b9e8e76eff83e13f8c41380cb4cc6ba264b1c12e7f9a26492197abe0bd95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-applicationinsights \
python39-azure-applicationinsights \
python3dist-azure-applicationinsights"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-nspkg \
python39-msrest"

inherit rpm
