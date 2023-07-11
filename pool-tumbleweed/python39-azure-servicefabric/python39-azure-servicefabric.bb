SUMMARY = "Microsoft Azure Service Fabric Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Fabric Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "8.2.0.0"

RPM_NAME = "python39-azure-servicefabric-8.2.0.0-1.9.noarch.rpm"
RPM_HASH = "6c28885d84ae7c5c983d4714f9f038a5112bc3a4c98cb76ca55dc05b710e530959555d0b3b2ec4a0f73872583cfa389d4a5ffa24207a2cf915abf135fbb1396f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-servicefabric \
python39-azure-servicefabric \
python3dist-azure-servicefabric"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-nspkg \
python39-msrest"

inherit rpm
