SUMMARY = "Cinnamon screensaver and locker"
DESCRIPTION = "cinnamon-screensaver is a screensaver and locker that aims to have \
simple, sane and secure defaults, and be well integrated with the \
Cinnamon Desktop."
LICENSE = "GPL-2.0-or-later"

PV = "5.8.0"

RPM_NAME = "cinnamon-screensaver-5.8.0-1.1.aarch64.rpm"
RPM_HASH = "f6a3837d6c98d86f3665286c6f7b21c3820b2f205cbfc0f000441a9029b1d8ea046399edeef71579fef6bbd99a7f616d45b864241aab69ac03994e516a5c1a28"

RPROVIDES:${PN} += "cinnamon-screensaver \
libcscreensaver.so.0 \
typelib-CScreensaver"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
iso-country-flags-png \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpam.so.0 \
libpango-1.0.so.0 \
libxdo.so.3 \
python3-cairo \
python3-gobject \
python3-gobject-Gdk \
python3-gobject-cairo \
python3-setproctitle \
python3-xapp \
typelib-AccountsService \
typelib-Atk \
typelib-CDesktopEnums \
typelib-Caribou \
typelib-CinnamonDesktop \
typelib-Cvc \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-GdkX11 \
typelib-Gio \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Pango \
typelib-XApp \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
