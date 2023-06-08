SUMMARY = "Fork of GNOME Screensaver for Budgie 10"
DESCRIPTION = "Fork of GNOME Screensaver for Budgie 10"
LICENSE = "GPL-2.0-or-later"

PV = "5.1.0+0"

RPM_NAME = "budgie-screensaver-5.1.0+0-4.3.aarch64.rpm"
RPM_HASH = "1cc0e45efd7f06d1ae37723786caaba2bad285865151bac49d0d2cf496cc814412f4c74dd5f332f12517e1833ef005198542ef7f27ccc24ed48b99cd995aef86"

RPROVIDES:${PN} += "application() application(budgie-screensaver.desktop) budgie-screensaver budgie-screensaver(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXxf86vm.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) libdbus-glib-1.so.2()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgnome-desktop-3.so.20()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) pam procps"

inherit rpm
