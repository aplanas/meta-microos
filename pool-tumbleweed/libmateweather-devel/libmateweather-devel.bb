SUMMARY = "MATE Weather development files"
DESCRIPTION = "libmateweather is a library to access weather information from \
online services for numerous locations."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.26.1"

RPM_NAME = "libmateweather-devel-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "e66100b344b662aaedbdb6be8f7446223a3e4dcf6f1ab81951aa7477c37d8cceea9c02b2ff0982d25c0264271f89d618c7bf2f3356ad2fed822c4de9dacfcfdb"

RPROVIDES:${PN} += "libmateweather-devel \
libmateweather-devel(aarch-64) \
pkgconfig(mateweather)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmateweather1 \
mateweather-common \
pkgconfig(gdk-pixbuf-2.0) \
pkgconfig(gio-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gobject-2.0) \
pkgconfig(gtk+-3.0) \
pkgconfig(libsoup-2.4) \
pkgconfig(libxml-2.0)"

inherit rpm
