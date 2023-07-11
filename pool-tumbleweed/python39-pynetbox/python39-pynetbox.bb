SUMMARY = "NetBox API client library"
DESCRIPTION = "Python API client library for NetBox."
LICENSE = "Apache-2.0"

PV = "7.0.1"

RPM_NAME = "python39-pynetbox-7.0.1-1.5.noarch.rpm"
RPM_HASH = "328141c19467dbbfaeeb08cbc9355bdec7c886455ef56dd3374c2bbb84450164977165f3e38e6d9661cb8870173f8c874c91eeadf91d05fd56c41a0f1ae529ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pynetbox \
python39-pynetbox \
python3dist-pynetbox"

RDEPENDS:${PN} += "python-abi \
python39-netaddr \
python39-requests"

inherit rpm
