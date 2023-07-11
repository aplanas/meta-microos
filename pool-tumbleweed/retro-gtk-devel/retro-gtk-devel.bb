SUMMARY = "Development files for retro-gtk, a Gtk+3 wrapper for libretro"
DESCRIPTION = "retro-gtk wraps the libretro API for use in Gtk applications. \
This subpackage contains the headers to make use of the libretro-gtk \
library."
LICENSE = "GPL-3.0-only"

PV = "1.0.2"

RPM_NAME = "retro-gtk-devel-1.0.2-2.8.aarch64.rpm"
RPM_HASH = "0d9a4081500d25bf0b4f6f7253a3443954c7f5aece7aee9d7b696a90d7b37c9afb61e6bfc063574c39b9dd261fcaca4d507032e0dbd1ea1f6186447c036022e7"

RPROVIDES:${PN} += "pkgconfig-retro-gtk-1 \
retro-gtk-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libretro-gtk-1-0 \
libretro-gtk-1.so.0 \
pkgconfig-glib-2.0 \
typelib-1-0-Retro-1-0"

inherit rpm
