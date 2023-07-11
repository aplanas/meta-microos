SUMMARY = "Toolkit to write Gtk+3-based frontends to libretro"
DESCRIPTION = "retro-gtk wraps the libretro API for use in Gtk applications such as \
GNOME Games. \
(libretro is an API specification implemented by some emulator \
libraries like libretro-bsnes.)"
LICENSE = "GPL-3.0-only"

PV = "1.0.2"

RPM_NAME = "libretro-gtk-1-0-1.0.2-2.8.aarch64.rpm"
RPM_HASH = "976e7a3ecf1a9428cd0a0a98a8a55b37318871ba7de19a39394ff3922951faa995ff1a7d0f26e51d9c64bfd187b6abc6d7ac6caedb1da78eb5321504be1eab97"

RPROVIDES:${PN} += "libretro-gtk-1-0 \
libretro-gtk-1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libepoxy.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
retro-gtk"

inherit rpm
