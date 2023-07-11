SUMMARY = "The glib binding library for urfkill"
DESCRIPTION = "Urfkill add-on library to integrate the standard urfkill library with \
the GLib thread abstraction and main loop. \
http://freedesktop.org/wiki/Software/urfkill"
LICENSE = "GPL-2.0-or-later"

PV = "0.5.0"

RPM_NAME = "liburfkill-glib-devel-0.5.0-3.7.aarch64.rpm"
RPM_HASH = "931f49d1009e9ea9764c8d48e88a8a065a41eb0c5d080ad6f3818e6a30c95052282a36de6d9b317313091f9214ba3e6ded374146bdc65c28053500c8cc2f18b4"

RPROVIDES:${PN} += "liburfkill-glib-devel \
pkgconfig-urfkill-glib \
urfkill-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glib2-devel \
liburfkill-glib0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gthread-2.0 \
typelib-1-0-Urfkill-0-0"

inherit rpm
