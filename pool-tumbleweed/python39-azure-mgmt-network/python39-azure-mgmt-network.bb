SUMMARY = "Microsoft Azure Network Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Network Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "23.1.0"

RPM_NAME = "python39-azure-mgmt-network-23.1.0-1.1.noarch.rpm"
RPM_HASH = "95df89a4d40c6a720474833087ca2c1a3e5b2d8cd0ba100161480f168cf013915f8038c129a800974e572e250e450b8065fdc5aa2428649c48cab81893d25110"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-network \
python39-azure-mgmt-network \
python3dist-azure-mgmt-network"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
