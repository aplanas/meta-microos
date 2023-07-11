SUMMARY = "Documentation files for libical-glib3"
DESCRIPTION = "Documentation files for libical-glib3"
LICENSE = "LGPL-2.1-only | MPL-2.0"

PV = "3.0.16"

RPM_NAME = "libical-glib-doc-3.0.16-1.4.noarch.rpm"
RPM_HASH = "eb8f1453582d68bf1349295d5bf52041bca7a8938d20559289cdf88a7eaaaf0b2574e0b85d39d279bd55a8e5186c55ac44107d6b80200592af3333abb5901efc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libical-glib-doc"

RDEPENDS:${PN} += ""

inherit rpm
