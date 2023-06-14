SUMMARY = "VNC client for GNOME"
DESCRIPTION = "Vinagre is a VNC client for GNOME that supports connecting to multiple \
machines, browsing for VNC servers via avahi and password storage in \
gnome-keyring."
LICENSE = "GPL-3.0-or-later"

PV = "3.22.0"

RPM_NAME = "vinagre-3.22.0-15.10.aarch64.rpm"
RPM_HASH = "467b599219e0e7a4f80926c56a4c2f26105d71cb78e92223d344a49ce6524795d59ea8f384c4a9fcf76ddd06dc8978199e1c937f3c9adaf7819cd36102ae280b"

RPROVIDES:${PN} += "vinagre"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavahi-common.so.3 \
libavahi-gobject.so.0 \
libavahi-ui-gtk3.so.0 \
libc.so.6 \
libcairo.so.2 \
libfreerdp2.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtk-vnc-2.0.so.0 \
libsecret-1.so.0 \
libspice-client-glib-2.0.so.8 \
libspice-client-gtk-3.0.so.5 \
libvte-2.91.so.0 \
libxml2.so.2"

inherit rpm
