SUMMARY = "Microsoft Azure Power BI Embedded Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Power BI Embedded Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-azure-mgmt-powerbiembedded-2.0.0-4.12.noarch.rpm"
RPM_HASH = "d49bfe45ac90b20f45850d2381ad016b591060343a9ca8da2033590561d3bf9dc9299357729730c37b102c257a6d9f6b9aef20bf5fca37617e123d517e71f894"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-powerbiembedded \
python3.11dist-azure-mgmt-powerbiembedded \
python311-azure-mgmt-powerbiembedded \
python3dist-azure-mgmt-powerbiembedded"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrestazure"

inherit rpm
