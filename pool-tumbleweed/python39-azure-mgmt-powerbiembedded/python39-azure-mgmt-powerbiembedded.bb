SUMMARY = "Microsoft Azure Power BI Embedded Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Power BI Embedded Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-azure-mgmt-powerbiembedded-2.0.0-4.11.noarch.rpm"
RPM_HASH = "62433422af361f27dcf0509a9c44e61b1b3059b599a48d3902e02f88ced24bc354dbb6c8491970981207556ab5f1d410d2d7dfbdd04e5c4bc9e20f60b01459a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-powerbiembedded) \
python39-azure-mgmt-powerbiembedded \
python3dist(azure-mgmt-powerbiembedded)"
RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrestazure"

inherit rpm
