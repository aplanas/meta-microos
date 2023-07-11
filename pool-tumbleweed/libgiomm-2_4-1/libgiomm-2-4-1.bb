SUMMARY = "C++ Interface for Gio"
DESCRIPTION = "Glibmm is the official C++ interface for the popular cross-platform \
library Glib. It provides non-UI API that is not available in standard \
C++ and makes it possible for gtkmm to wrap GObject-based APIs."
LICENSE = "LGPL-2.1-or-later"

PV = "2.66.6"

RPM_NAME = "libgiomm-2_4-1-2.66.6-1.2.aarch64.rpm"
RPM_HASH = "255f688dfce42bd2f77ea866412041e4191f6f2189c8e373732580dc9c2b8c395ed584ca5205ca8527e59955a7a4ee0a43408938ca690f1dc6a24d4e5972b8f2"

RPROVIDES:${PN} += "libgiomm-2-4-1 \
libgiomm-2.4.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libsigc-2.0.so.0 \
libstdc++.so.6"

inherit rpm
