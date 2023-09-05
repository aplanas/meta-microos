SUMMARY = "Samples for jaxen"
DESCRIPTION = "Samples for jaxen."
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "jaxen-demo-1.2.0-1.1.noarch.rpm"
RPM_HASH = "6eeade1032f433ff3e63005ef86cb14283f14f82b67d11343233520bdc09e12af96f41622a02c743686e348ba1241ec854a30dc318ec0d9d1194d0bb6c618ff2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jaxen-demo"

RDEPENDS:${PN} += "jaxen"

inherit rpm
