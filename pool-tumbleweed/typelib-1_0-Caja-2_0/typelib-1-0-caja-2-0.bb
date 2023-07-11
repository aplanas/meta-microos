SUMMARY = "MATE file manager typelib"
DESCRIPTION = "Caja is the official file manager for the MATE desktop. It allows to \
browse directories, preview files and launch applications associated \
with them. It is also responsible for handling the icons on the MATE \
desktop. It works on local and remote filesystems."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.26.1"

RPM_NAME = "typelib-1_0-Caja-2_0-1.26.1-1.5.aarch64.rpm"
RPM_HASH = "34f1b4b27cf1aa81185be29176b6d300f58d2d99197d09dc0daa2730ff40f03e72512f32a16019a9f6fcba3575e3b0d0e783b3dc6793b6237a901fe05c5125c5"

RPROVIDES:${PN} += "typelib-1-0-Caja-2-0 \
typelib-Caja"

RDEPENDS:${PN} += "libcaja-extension.so.1 \
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
