SUMMARY = "Development files for libaccounts-glib"
DESCRIPTION = "This package contains the development files for the accounts-glib \
library."
LICENSE = "LGPL-2.1-only"

PV = "1.26"

RPM_NAME = "libaccounts-glib-devel-1.26-1.4.aarch64.rpm"
RPM_HASH = "fb745ba0daa227029d7c7729fa77369e07840c3e8cda7c59b7fd2e88da71cd1d79d010f2ced18e0538af96da35de6beba600f9f765efe9de12744bc4e04a89f1"

RPROVIDES:${PN} += "libaccounts-glib-devel \
pkgconfig-libaccounts-glib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libaccounts-glib0 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libxml-2.0 \
pkgconfig-sqlite3 \
python3-libaccounts \
typelib-1-0-Accounts-1-0"

inherit rpm
