SUMMARY = "Microsoft Azure Storagecache Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Storagecache Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python311-azure-mgmt-storagecache-1.5.0-1.1.noarch.rpm"
RPM_HASH = "6aaefa370971d90fd40f066760ce6d21d60fcae505b57000e4b5d548902ffe3a5ae6c14c63480f8bd8a6c19ec88fa5e6c409c816bfad6aed27002a2e7e305bb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-storagecache \
python3.11dist-azure-mgmt-storagecache \
python311-azure-mgmt-storagecache \
python3dist-azure-mgmt-storagecache"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
