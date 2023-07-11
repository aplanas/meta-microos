SUMMARY = "Microsoft Azure Power BI Embedded Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Power BI Embedded Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-azure-mgmt-powerbiembedded-2.0.0-4.12.noarch.rpm"
RPM_HASH = "75a846ef145dd14f124262f033d8a24c4808182043cab0fe3ef6b2da15399922705f6c69382e7ff83ec3afc36f372f06920088d2429f92b3d8397e7d971f2f84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-powerbiembedded \
python310-azure-mgmt-powerbiembedded \
python3dist-azure-mgmt-powerbiembedded"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrestazure"

inherit rpm
