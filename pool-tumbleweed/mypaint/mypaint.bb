SUMMARY = "Graphics application for digital painters"
DESCRIPTION = "MyPaint is a graphics application for digital painters. It supports \
graphics tablets made by Wacom, and many similar devices. The \
standard brushes can emulate traditional media like charcoal, \
pencils, ink, or paint."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.1"

RPM_NAME = "mypaint-2.0.1-3.14.aarch64.rpm"
RPM_HASH = "d4683b025688552e6b62f057bcebf0105977dbbffefdf14f33f45c50509e9cbc7ea6abc87c076079958d97e866880ec4dea149aa28cdac759712107e427c12ec"

RPROVIDES:${PN} += "application() \
application(mypaint.desktop) \
metainfo() \
metainfo(mypaint.appdata.xml) \
mimehandler(image/jpeg) \
mimehandler(image/openraster) \
mimehandler(image/png) \
mypaint \
mypaint(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgomp.so.1()(64bit) \
liblcms2.so.2()(64bit) \
libm.so.6()(64bit) \
libmypaint.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libstdc++.so.6()(64bit) \
mypaint-brushes \
python3-gobject-Gdk \
python3-numpy \
python3-pycairo \
typelib(GLib) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gio) \
typelib(Gtk) \
typelib(Pango) \
typelib(PangoCairo)"

inherit rpm
