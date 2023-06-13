SUMMARY = "Microsoft Azure Application Insights Client Library"
DESCRIPTION = "This is the Microsoft Azure Application Insights Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python39-azure-applicationinsights-0.1.1-2.3.noarch.rpm"
RPM_HASH = "4e42aaf22ae26cfffcee722f18ba96b91f57e6a00c932665ce095b45422807962cbcdf1e1a88431bcf5d4c6469a75d07fa5d86354c9c25a8e6987769643188de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-applicationinsights) \
python39-azure-applicationinsights \
python3dist(azure-applicationinsights)"

RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-nspkg \
python39-msrest"

inherit rpm
