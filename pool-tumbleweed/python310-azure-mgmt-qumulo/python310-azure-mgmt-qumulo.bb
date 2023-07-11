SUMMARY = "Microsoft Azure Qumulo Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Qumulo Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-mgmt-qumulo-1.0.0-1.2.noarch.rpm"
RPM_HASH = "c2d11dfb827101fcc584fff7f21e9498f41bb2fc655fd472b0ad7d702d1f4300868d784689c197dafcb4fae0817c8ff30a3ad4ae140751654c16aef6090c6f59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-qumulo \
python310-azure-mgmt-qumulo \
python3dist-azure-mgmt-qumulo"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
