SUMMARY = "GtkD base library"
DESCRIPTION = "This package contains the GtkD base library."
LICENSE = "LGPL-3.0-or-later"

PV = "3.9.0"

RPM_NAME = "libgtkd-3-0-3.9.0-2.12.aarch64.rpm"
RPM_HASH = "b255501112ee263f7a9c833262e2bb4735c2017e818de49e9940aa513c8d142ae6af08eed8f845a2f0ebb2b6440c89eadfd5e280b2bb253401c704852f5ef7d5"

RPROVIDES:${PN} += "libgtkd-3-0 \
libgtkd-3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libdruntime-ldc-shared.so.102 \
libgcc-s.so.1 \
libphobos2-ldc-shared.so.102"

inherit rpm
