SUMMARY = "Development files for libpanel"
DESCRIPTION = "The libpanel-devel package contains libraries and header files for \
developing applications that use libpanel."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.0"

RPM_NAME = "libpanel-devel-1.2.0-1.2.aarch64.rpm"
RPM_HASH = "b9482a7ba49e58227b88bf4ae2420953a350f2c0d6e80b5c9e223f485f113008804ccad9950a2182a7972f9c975a641b7251448e9104b015ab1f477fc4124dc9"

RPROVIDES:${PN} += "libpanel-devel \
pkgconfig-libpanel-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpanel1-1 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gtk4 \
typelib-1-0-Panel-1"

inherit rpm
