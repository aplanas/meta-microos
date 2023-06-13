SUMMARY = "Development files for retro-gtk, a Gtk+3 wrapper for libretro"
DESCRIPTION = "retro-gtk wraps the libretro API for use in Gtk applications. \
This subpackage contains the headers to make use of the libretro-gtk \
library."
LICENSE = "GPL-3.0-only"

PV = "1.0.2"

RPM_NAME = "retro-gtk-devel-1.0.2-2.7.aarch64.rpm"
RPM_HASH = "bda6a9bd89ea0b9d03d3f1690f289a5fb0edaf14f4ec59c835305d7f053e17f5bae747d963bd8be39c4d6a373815afab4aa85a1134c96872efe88d1c7fa5748c"

RPROVIDES:${PN} += "pkgconfig(retro-gtk-1) \
retro-gtk-devel \
retro-gtk-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libretro-gtk-1-0 \
libretro-gtk-1.so.0()(64bit) \
pkgconfig(glib-2.0) \
typelib-1_0-Retro-1-0"

inherit rpm
