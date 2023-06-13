SUMMARY = "Documentation for Middleware for OpenStack Identity"
DESCRIPTION = "Documentation for Middleware for OpenStack Identity."
LICENSE = "Apache-2.0"

PV = "10.2.0"

RPM_NAME = "python-keystonemiddleware-doc-10.2.0-1.2.noarch.rpm"
RPM_HASH = "28f0426b56035566b9bede9d920fd569d272f80414e0b193bc258d52ea0340f8cf22d3083b9d84f9c9af8dafee83ddfacd1f51f5d5e87b540b9b74f0d19711e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-keystonemiddleware-doc"

RDEPENDS:${PN} += ""

inherit rpm
