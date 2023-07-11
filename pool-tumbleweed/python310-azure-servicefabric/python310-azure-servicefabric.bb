SUMMARY = "Microsoft Azure Service Fabric Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Fabric Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "8.2.0.0"

RPM_NAME = "python310-azure-servicefabric-8.2.0.0-1.9.noarch.rpm"
RPM_HASH = "0898aa294691ba54f3f2d11cf47cffe8be10f20fa223ef27019d0a4e18bec4e9b4809f883300dddade8eba42e7e60795c1783f9c2d224a67822672f8136804f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-servicefabric \
python310-azure-servicefabric \
python3dist-azure-servicefabric"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-nspkg \
python310-msrest"

inherit rpm
