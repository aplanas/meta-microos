SUMMARY = "MATE file manager typelib"
DESCRIPTION = "Caja is the official file manager for the MATE desktop. It allows to \
browse directories, preview files and launch applications associated \
with them. It is also responsible for handling the icons on the MATE \
desktop. It works on local and remote filesystems."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.26.1"

RPM_NAME = "typelib-1_0-Caja-2_0-1.26.1-1.4.aarch64.rpm"
RPM_HASH = "c675d77b0baf629f2651d7d3657b1535799024cda3dba9e7ab82029546630be233daafd411339caaaa3114ee2542c46b2f7884d522deb318c0156f2f3dca588e"

RPROVIDES:${PN} += "typelib(Caja) \
typelib-1_0-Caja-2_0 \
typelib-1_0-Caja-2_0(aarch-64)"

RDEPENDS:${PN} += "libcaja-extension.so.1()(64bit) \
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
