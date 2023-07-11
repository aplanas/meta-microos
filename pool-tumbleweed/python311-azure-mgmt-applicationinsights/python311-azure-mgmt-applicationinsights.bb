SUMMARY = "Microsoft Azure Application Insights Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Application Insights Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python311-azure-mgmt-applicationinsights-4.0.0-1.2.noarch.rpm"
RPM_HASH = "4ce9c02962019e49ce313e2080aeeccc74a834165033661182c3b17a4586506a2ba08cdca9d9f3b65c38548d5b1fe6feb37748419b0883142606ad68bf6cc142"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-applicationinsights \
python3.11dist-azure-mgmt-applicationinsights \
python311-azure-mgmt-applicationinsights \
python3dist-azure-mgmt-applicationinsights"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
