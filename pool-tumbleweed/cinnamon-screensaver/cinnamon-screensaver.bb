SUMMARY = "Cinnamon screensaver and locker"
DESCRIPTION = "cinnamon-screensaver is a screensaver and locker that aims to have \
simple, sane and secure defaults, and be well integrated with the \
Cinnamon Desktop."
LICENSE = "GPL-2.0-or-later"

PV = "5.6.3"

RPM_NAME = "cinnamon-screensaver-5.6.3-1.3.aarch64.rpm"
RPM_HASH = "b6dc1e9bca1e74a788e93f6b4f9e240c6fd137ae07f100165a2008d971a6bca2ab230f93c64acbaf8fcdc15a34b8a3d09e24cc3b2e749e0e6d11ccf6aa04179c"

RPROVIDES:${PN} += "cinnamon-screensaver \
libcscreensaver.so.0 \
typelib-CScreensaver"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
iso-country-flags-png \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libc.so.6 \
libcairo.so.2 \
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
