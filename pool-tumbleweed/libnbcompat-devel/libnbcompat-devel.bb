SUMMARY = "Development files for libnbcompat"
DESCRIPTION = "This package holds the development files for libnbcompat. \
 \
libnbcompat is a NetBSD compatibility library that supplies routines used by NetBSD \
bootstrap tools that are missing on other operating systems."
LICENSE = "BSD-4-Clause"

PV = "1.0.1"

RPM_NAME = "libnbcompat-devel-1.0.1-3.1.aarch64.rpm"
RPM_HASH = "26994de58e64dfb7507ab07ba6ef0e908cba0c8fc30109a4522ca34593f258c62959e641ff62d1be29372cc666ff320c69fe3b58202bb31611b55ad4b4dfc073"

RPROVIDES:${PN} += "libnbcompat-devel"

RDEPENDS:${PN} += "libnbcompat0"

inherit rpm
