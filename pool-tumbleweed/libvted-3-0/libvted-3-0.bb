SUMMARY = "GtkD vted library"
DESCRIPTION = "This package contains the GtkD vted library."
LICENSE = "LGPL-3.0-or-later"

PV = "3.9.0"

RPM_NAME = "libvted-3-0-3.9.0-2.12.aarch64.rpm"
RPM_HASH = "03584bd0835fd7a3d76c074251e7df6cca40783bea52457d3c7b534085e1d1b761232fc7747134ad181b3bd1cb80b55fa5a9d4903fe700658965a311386775e5"

RPROVIDES:${PN} += "libvted-3-0 \
libvted-3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libdruntime-ldc-shared.so.102 \
libgcc-s.so.1 \
libphobos2-ldc-shared.so.102"

inherit rpm
