SUMMARY = "Microsoft Azure Service Fabric Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Fabric Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "8.2.0.0"

RPM_NAME = "python311-azure-servicefabric-8.2.0.0-1.9.noarch.rpm"
RPM_HASH = "17b0deb67d5d060131b016aecfe2f1d114f6d1be0b4b55de9f1444d2cdcdd2b4d7fe6df817cdbcf30fdb141a4738ca6e0f2f5c50286d50ee9e25188c1ae7fa4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-servicefabric \
python3.11dist-azure-servicefabric \
python311-azure-servicefabric \
python3dist-azure-servicefabric"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-nspkg \
python311-msrest"

inherit rpm
