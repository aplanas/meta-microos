SUMMARY = "Module to get MAC addresses of remote hosts and local interfaces"
DESCRIPTION = "A Python module to get MAC addresses of remote hosts and local interfaces."
LICENSE = "MIT"

PV = "0.8.3"

RPM_NAME = "python39-getmac-0.8.3-1.6.noarch.rpm"
RPM_HASH = "321f4417a0213f1a3a06d1acc3d9ef30bffb5134be4e24ad4a89022a274461e59fd4d44768aaad63499dba395226496901829e79c6b08e2d46880c05a04391bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-getmac \
python39-getmac \
python3dist-getmac"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
