SUMMARY = "Microsoft Azure Application Insights Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Application Insights Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python311-azure-mgmt-applicationinsights-4.0.0-1.1.noarch.rpm"
RPM_HASH = "bf913686fd91fbd7ac266fb7326414faa1bf8351164a7faeb025428cccac68f4a6652ad491fa49b0eea88f6db3be43b447ace98204b8c46887759a380b48e53f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-applicationinsights \
python311-azure-mgmt-applicationinsights \
python3dist-azure-mgmt-applicationinsights"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
