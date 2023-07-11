SUMMARY = "Development files for libdnf"
DESCRIPTION = "This package provides the headers and libraries for developing applications \
that use libdnf."
LICENSE = "LGPL-2.1-or-later"

PV = "0.70.1"

RPM_NAME = "libdnf-devel-0.70.1-1.2.aarch64.rpm"
RPM_HASH = "29d662b6b07b983bcbdd672be4b3dbeef5f41cfffa20e8c226db94f1c330b6f2cecabb9bb09efcb7290fd3016ec06b6a72db983fc44fd04bd8ce78ae45201d59"

RPROVIDES:${PN} += "libdnf-devel \
pkgconfig-libdnf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdnf2 \
pkgconfig-glib-2.0 \
pkgconfig-librepo \
pkgconfig-libsolv \
pkgconfig-libsolvext \
pkgconfig-rpm \
pkgconfig-sqlite3"

inherit rpm
