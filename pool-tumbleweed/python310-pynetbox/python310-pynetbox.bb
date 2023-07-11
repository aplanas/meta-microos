SUMMARY = "NetBox API client library"
DESCRIPTION = "Python API client library for NetBox."
LICENSE = "Apache-2.0"

PV = "7.0.1"

RPM_NAME = "python310-pynetbox-7.0.1-1.5.noarch.rpm"
RPM_HASH = "2dbf69c0e8bab145dacb905a5e5248d7d494488d6c088421d326c1b8776033d58a84e274c1c957d1b1e0a703c5390775a66a79a0acfda37f77b67605461bcf38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pynetbox \
python310-pynetbox \
python3dist-pynetbox"

RDEPENDS:${PN} += "python-abi \
python310-netaddr \
python310-requests"

inherit rpm
