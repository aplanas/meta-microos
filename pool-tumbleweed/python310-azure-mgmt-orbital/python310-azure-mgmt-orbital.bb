SUMMARY = "Microsoft Azure Orbital Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Orbital Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-azure-mgmt-orbital-2.0.0-1.3.noarch.rpm"
RPM_HASH = "0aaae1e5eefbf372a53204af1942750c520c51f167ce46481c1af950ea7a0d0e1549b55c3ece64453311fc8afb2fdc84c0d2ca94fd9713c99262726eb44a218a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-orbital \
python310-azure-mgmt-orbital \
python3dist-azure-mgmt-orbital"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
