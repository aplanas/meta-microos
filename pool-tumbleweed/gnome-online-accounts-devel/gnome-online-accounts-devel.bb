SUMMARY = "GNOME service to access online accounts -- Development Files"
DESCRIPTION = "gnome-online-accounts provides interfaces so applications and \
libraries in GNOME can access the user's online accounts."
LICENSE = "LGPL-2.0-or-later"

PV = "3.48.0"

RPM_NAME = "gnome-online-accounts-devel-3.48.0-1.2.aarch64.rpm"
RPM_HASH = "45c9e598f25beec433c9d41cd9fe3388282866cdec191c2fa0cfe67e4c45575011ef5f2ab7144951289f599a2c74faf318d35c98ce720288833b9567cb6150e2"

RPROVIDES:${PN} += "gnome-online-accounts-devel \
pkgconfig-goa-1.0 \
pkgconfig-goa-backend-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgoa-1-0-0 \
libgoa-backend-1-0-1 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-goa-1.0 \
pkgconfig-gtk+-3.0 \
typelib-1-0-Goa-1-0"

inherit rpm
