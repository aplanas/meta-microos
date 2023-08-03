SUMMARY = "Documentation for OpenStack Key Management API Client"
DESCRIPTION = "Documentation for the client library for interacting with \
Openstack Key Management API"
LICENSE = "Apache-2.0"

PV = "5.2.0"

RPM_NAME = "python-barbicanclient-doc-5.2.0-1.5.noarch.rpm"
RPM_HASH = "6f2bf927c0621381bbedbfd09f103d11b31798d4657417ee804b295d18993701e3f6217fcac015cfaaac130a02930159e6b24fd1a552e7aa49f6607fd55cb93b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-barbicanclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
