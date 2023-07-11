SUMMARY = "Microsoft Azure Commerce Client Library"
DESCRIPTION = "This is the Microsoft Azure Commerce Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "6.0.0"

RPM_NAME = "python39-azure-mgmt-commerce-6.0.0-1.11.noarch.rpm"
RPM_HASH = "57a829757f580891422690bd8d2082b30ead42c68c0fbc0fd43416824d984fd08a4b7e50c7ec3d6710278659e1403dc18426e61657d6e72cf328f3ce1415e347"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-commerce \
python39-azure-mgmt-commerce \
python3dist-azure-mgmt-commerce"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg"

inherit rpm
