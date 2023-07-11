SUMMARY = "GObject introspection bindings for libretro-gtk"
DESCRIPTION = "retro-gtk wraps the libretro API for use in Gtk applications. \
This subpackage contains the gobject bindings for the \
libretro-gtk shared library."
LICENSE = "GPL-3.0-only"

PV = "1.0.2"

RPM_NAME = "typelib-1_0-Retro-1-0-1.0.2-2.8.aarch64.rpm"
RPM_HASH = "527b5f77985b0d41c1cbc0e422389021d4ed64503dd35423446ea87f0a07f7c16e8be21abfd505a0252de2539243bcd732320940900c5bccfcc28cecce7e3d0c"

RPROVIDES:${PN} += "typelib-1-0-Retro-1-0 \
typelib-Retro"

RDEPENDS:${PN} += "libretro-gtk-1.so.0 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Pango \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
