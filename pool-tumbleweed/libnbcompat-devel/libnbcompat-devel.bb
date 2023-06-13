SUMMARY = "Development files for libnbcompat"
DESCRIPTION = "This package holds the development files for libnbcompat. \
 \
libnbcompat is a NetBSD compatibility library that supplies routines used by NetBSD \
bootstrap tools that are missing on other operating systems."
LICENSE = "BSD-4-Clause"

PV = "1.0.1"

RPM_NAME = "libnbcompat-devel-1.0.1-2.8.aarch64.rpm"
RPM_HASH = "c90694471b92a664a06b014f122130f6abaad3b3cdd4ab7ebd342950b0109daa56ad4d0048a2be19c8e67456bb598184987e0a5054eb914080c3d2cb291a574b"

RPROVIDES:${PN} += "libnbcompat-devel \
libnbcompat-devel(aarch-64)"

RDEPENDS:${PN} += "libnbcompat0"

inherit rpm
