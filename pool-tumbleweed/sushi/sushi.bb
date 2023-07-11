SUMMARY = "Quick Previewer for Nautilus"
DESCRIPTION = "Sushi is a quick previewer for Nautilus, the GNOME desktop file manager."
LICENSE = "SUSE-GPL-2.0-with-plugin-exception"

PV = "44.2"

RPM_NAME = "sushi-44.2-1.1.aarch64.rpm"
RPM_HASH = "a326569dc5f56a70586d386f53383e65c7f5b23c24241bb2613d362a47c2204d9bce2901a9b3162028ae2e6a016bb373e90221ac9ff33013b97d4f67eb7890de"

RPROVIDES:${PN} += "libsushi-1.0.so \
sushi \
typelib-Sushi"

RDEPENDS:${PN} += "/usr/bin/gjs \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libepoxy.so.0 \
libevdocument3.so.4 \
libfreetype.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstaudio-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgtk-3.so.0 \
libharfbuzz.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
typelib-Atk \
typelib-EvinceDocument \
typelib-EvinceView \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gst \
typelib-GstBase \
typelib-GstTag \
typelib-Gtk \
typelib-GtkSource \
typelib-HarfBuzz \
typelib-Pango \
typelib-Soup \
typelib-Sushi \
typelib-WebKit2 \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
