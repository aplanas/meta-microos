SUMMARY = "Fork of GNOME Screensaver for Budgie 10"
DESCRIPTION = "Fork of GNOME Screensaver for Budgie 10"
LICENSE = "GPL-2.0-or-later"

PV = "5.1.0+0"

RPM_NAME = "budgie-screensaver-5.1.0+0-4.3.aarch64.rpm"
RPM_HASH = "1cc0e45efd7f06d1ae37723786caaba2bad285865151bac49d0d2cf496cc814412f4c74dd5f332f12517e1833ef005198542ef7f27ccc24ed48b99cd995aef86"

RPROVIDES:${PN} += "budgie-screensaver"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXxf86vm.so.1 \
libc.so.6 \
libcairo.so.2 \
libdbus-1.so.3 \
libdbus-glib-1.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-desktop-3.so.20 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpam.so.0 \
libsystemd.so.0 \
pam \
procps"

inherit rpm
