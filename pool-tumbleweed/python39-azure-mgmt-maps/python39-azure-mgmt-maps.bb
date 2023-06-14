SUMMARY = "Microsoft Azure Maps Client Library"
DESCRIPTION = "This is the Microsoft Azure Maps Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-azure-mgmt-maps-2.0.0-1.8.noarch.rpm"
RPM_HASH = "f6d3dc36c75ae266214d7c558be50261a41692e5d7d936bb59df41697cb9f952656324b4dd56cc92ebc468a033559a719223c52bf8a2ce2ba19083e02959d62b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-maps \
python39-azure-mgmt-maps \
python3dist-azure-mgmt-maps"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
