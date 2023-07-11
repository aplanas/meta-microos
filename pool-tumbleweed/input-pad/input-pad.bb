SUMMARY = "On-screen Input Pad to Send Characters with Mouse"
DESCRIPTION = "The input pad is a tool to send a character on button to text applications."
LICENSE = "LGPL-2.0-or-later"

PV = "1.0.99.20140916"

RPM_NAME = "input-pad-1.0.99.20140916-5.10.aarch64.rpm"
RPM_HASH = "58fa4693786cc8cd3ed56666d46cf6cfdc80d02d4d7f264a7ee72d5392e080caf473fb85708c128be6accea0bd42f0e2f66473f48cd8a7ca683bcb38a2118f0a"

RPROVIDES:${PN} += "input-pad \
libinput-pad-1.0.so.1 \
typelib-InputPad"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libxkbfile.so.1 \
libxklavier.so.16 \
libxml2.so.2 \
python3-gobject \
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
