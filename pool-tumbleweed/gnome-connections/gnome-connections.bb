SUMMARY = "A remote desktop client for GNOME"
DESCRIPTION = "A remote desktop client for the GNOME desktop environment."
LICENSE = "GPL-3.0-or-later"

PV = "44.1"

RPM_NAME = "gnome-connections-44.1-1.1.aarch64.rpm"
RPM_HASH = "1ed1b50bec122eba8464415b0a5028e35d072eb2a5a25c7f05e6a74e441dd9be6792013bb4cc7622a8b5a0b55cd891690b101808ca0d062ec1b1350255c29afa"

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
