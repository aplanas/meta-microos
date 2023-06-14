SUMMARY = "NetBox API client library"
DESCRIPTION = "Python API client library for NetBox."
LICENSE = "Apache-2.0"

PV = "7.0.1"

RPM_NAME = "python39-pynetbox-7.0.1-1.3.noarch.rpm"
RPM_HASH = "b1a0ceb86c60f13d0ee425f2645901bf288a9dffc7c38c45ec97e5a404d0bd55e88a631376e160e0e41445f6e38a4e502ef4aacc51dced95e1e0ee71aacc3b7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pynetbox \
python39-pynetbox \
python3dist-pynetbox"

RDEPENDS:${PN} += "python-abi \
python39-netaddr \
python39-requests"

inherit rpm
