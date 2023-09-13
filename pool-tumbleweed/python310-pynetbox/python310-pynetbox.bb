SUMMARY = "NetBox API client library"
DESCRIPTION = "Python API client library for NetBox."
LICENSE = "Apache-2.0"

PV = "7.2.0"

RPM_NAME = "python310-pynetbox-7.2.0-1.1.noarch.rpm"
RPM_HASH = "bddcd66b309e932f28269a1164a4a1c5ec361d91ea6fa4402f29fbbda79907aa0e4410a106dbc1c044c8cae6854f1f9f9f34456701630ed0ebd9448c281cbe6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pynetbox \
python310-pynetbox \
python3dist-pynetbox"

RDEPENDS:${PN} += "python-abi \
python310-packaging \
python310-requests"

inherit rpm
