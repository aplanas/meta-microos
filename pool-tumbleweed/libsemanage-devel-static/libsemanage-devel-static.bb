SUMMARY = "Static archives for SELinux's policy management library"
DESCRIPTION = "The libsemanage-devel-static package contains the static libraries \
needed for developing applications that manipulate binary policies."
LICENSE = "LGPL-2.1-or-later"

PV = "3.5"

RPM_NAME = "libsemanage-devel-static-3.5-1.9.aarch64.rpm"
RPM_HASH = "ebd759e7d7bdf17e50dddc2a0cce33ed9ceef8a82a4c0412f19e203c7b6cee38cae7e30a33664ef5ae5a82b1007dbf00ef157111cf5f3a0286422b5bb44ca523"

RPROVIDES:${PN} += "libsemanage-devel-static"

RDEPENDS:${PN} += "libsemanage-devel"

inherit rpm
