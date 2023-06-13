SUMMARY = "Microsoft Azure Power BI Embedded Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Power BI Embedded Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-azure-mgmt-powerbiembedded-2.0.0-4.11.noarch.rpm"
RPM_HASH = "026f2480847e1cab40b09ab8f52385d5a0aa26347ade050a45acd5f020021f54710f38098d97e94ae300884197bdeacd901ba3aded40ecabc040a9a445373a1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-powerbiembedded) \
python311-azure-mgmt-powerbiembedded \
python3dist(azure-mgmt-powerbiembedded)"

RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrestazure"

inherit rpm
