SUMMARY = "Documentation for OpenStack Key Management API Client"
DESCRIPTION = "Documentation for the client library for interacting with \
Openstack Key Management API"
LICENSE = "Apache-2.0"

PV = "5.2.0"

RPM_NAME = "python-barbicanclient-doc-5.2.0-1.4.noarch.rpm"
RPM_HASH = "02a2580d4868d271355c9c6b3a80ef5b21eef90773bb9acc9829c7812aea00d1aed54b950b641430d95442ac355ad677a75e50eb555bbb26f750774a27941103"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-barbicanclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
