SUMMARY = "Development files for libaccounts-glib"
DESCRIPTION = "This package contains the development files for the accounts-glib \
library."
LICENSE = "LGPL-2.1-only"

PV = "1.26"

RPM_NAME = "libaccounts-glib-devel-1.26-1.3.aarch64.rpm"
RPM_HASH = "3e27e1d7c96229240c5301bc3a67c50870343c92bb3834562922784c152b6c6170c3a11cd4ce1145a6ecf6e5b6aae76654da5986ef1b94727d7bce52e937fecb"

RPROVIDES:${PN} += "libaccounts-glib-devel \
libaccounts-glib-devel(aarch-64) \
pkgconfig(libaccounts-glib)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libaccounts-glib0 \
pkgconfig(gio-2.0) \
pkgconfig(gio-unix-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gobject-2.0) \
pkgconfig(libxml-2.0) \
pkgconfig(sqlite3) \
python3-libaccounts \
typelib-1_0-Accounts-1_0"

inherit rpm
