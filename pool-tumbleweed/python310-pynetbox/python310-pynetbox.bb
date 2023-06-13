SUMMARY = "NetBox API client library"
DESCRIPTION = "Python API client library for NetBox."
LICENSE = "Apache-2.0"

PV = "7.0.1"

RPM_NAME = "python310-pynetbox-7.0.1-1.3.noarch.rpm"
RPM_HASH = "6ca6b0d3dfbfe9f4a7ec3600c5831824b6bbbb006df07b4ebbff7510ee2243a6bfe5f9e4edc8e8a5621ce41d57819b9006bb8cd4a4c9c51c454f87192dfecf7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pynetbox \
python3.10dist(pynetbox) \
python310-pynetbox \
python3dist(pynetbox)"

RDEPENDS:${PN} += "python(abi) \
python310-netaddr \
python310-requests"

inherit rpm
