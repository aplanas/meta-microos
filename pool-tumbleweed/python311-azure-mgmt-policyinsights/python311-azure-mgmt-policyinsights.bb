SUMMARY = "Microsoft Azure Policy Insights Client Library"
DESCRIPTION = "This is the Microsoft Azure Policy Insights Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.1.0b4"

RPM_NAME = "python311-azure-mgmt-policyinsights-1.1.0b4-1.3.noarch.rpm"
RPM_HASH = "17cf07d7bbcf6920feda3fd0b747e64e7e20234f096a506be3680f440ce372bbf893ab6270380455c98ec0625682929b1373c58f839f2d00d8924156fb3f6f5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-policyinsights \
python311-azure-mgmt-policyinsights \
python3dist-azure-mgmt-policyinsights"

RDEPENDS:${PN} += "-python311-typing-extensions >= 4.3.0 if python311-base < 3.8 \
python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
