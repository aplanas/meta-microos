SUMMARY = "Microsoft Azure Maps Client Library"
DESCRIPTION = "This is the Microsoft Azure Maps Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-azure-mgmt-maps-2.0.0-1.9.noarch.rpm"
RPM_HASH = "ee5c8fa41eb6989dc5bf501001b0a00c12fe96f3a7e4596f2b3bb48fdf34b0e8f6b90ed257d7de64eb912cafd079498bf221f840495fcf46103ea701a78db1d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-maps \
python310-azure-mgmt-maps \
python3dist-azure-mgmt-maps"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
