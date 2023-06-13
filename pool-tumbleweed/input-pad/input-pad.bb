SUMMARY = "On-screen Input Pad to Send Characters with Mouse"
DESCRIPTION = "The input pad is a tool to send a character on button to text applications."
LICENSE = "LGPL-2.0-or-later"

PV = "1.0.99.20140916"

RPM_NAME = "input-pad-1.0.99.20140916-5.9.aarch64.rpm"
RPM_HASH = "d0f7a1cd70725a9435fc24c6b21e560abe693ad7cafdc432f006f6fb0e01a974f2b2147eb9a98afc57144c50991fcc3b8d387d1a83643b490a3eb8bc3adfdb8c"

RPROVIDES:${PN} += "input-pad \
input-pad(aarch-64) \
libinput-pad-1.0.so.1()(64bit) \
typelib(InputPad)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libxkbfile.so.1()(64bit) \
libxklavier.so.16()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
python3-gobject \
typelib(Atk) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gio) \
typelib(Gtk) \
typelib(HarfBuzz) \
typelib(Pango) \
typelib(cairo) \
typelib(freetype2) \
typelib(xlib)"

inherit rpm
