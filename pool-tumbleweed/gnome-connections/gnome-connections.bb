SUMMARY = "A remote desktop client for GNOME"
DESCRIPTION = "A remote desktop client for the GNOME desktop environment."
LICENSE = "GPL-3.0-or-later"

PV = "44.1"

RPM_NAME = "gnome-connections-44.1-1.3.aarch64.rpm"
RPM_HASH = "0ebef2eef310f0c94f92c53c3ee746ad9efd45100f886526742839db7cbe24d4c0bb5a169f11ceaf1d5bb5e0985d90857b7d4b3e664e56f4e25a62384f495af0"

RPROVIDES:${PN} += "gnome-connections \
libgtk-frdp-0.2.so \
typelib-GtkFrdp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libfreerdp-client2.so.2 \
libfreerdp2.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtk-vnc-2.0.so.0 \
libgvnc-1.0.so.0 \
libgvncpulse-1.0.so.0 \
libhandy-1.so.0 \
libsecret-1.so.0 \
libwinpr2.so.2 \
libxml2.so.2 \
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
