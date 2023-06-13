SUMMARY = "VNC client for GNOME"
DESCRIPTION = "Vinagre is a VNC client for GNOME that supports connecting to multiple \
machines, browsing for VNC servers via avahi and password storage in \
gnome-keyring."
LICENSE = "GPL-3.0-or-later"

PV = "3.22.0"

RPM_NAME = "vinagre-3.22.0-15.10.aarch64.rpm"
RPM_HASH = "467b599219e0e7a4f80926c56a4c2f26105d71cb78e92223d344a49ce6524795d59ea8f384c4a9fcf76ddd06dc8978199e1c937f3c9adaf7819cd36102ae280b"

RPROVIDES:${PN} += "application() \
application(vinagre-file.desktop) \
application(vinagre.desktop) \
metainfo() \
metainfo(vinagre.appdata.xml) \
mimehandler(application/x-remote-connection) \
mimehandler(application/x-vnc) \
mimehandler(x-scheme-handler/vnc) \
vinagre \
vinagre(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libavahi-common.so.3()(64bit) \
libavahi-gobject.so.0()(64bit) \
libavahi-ui-gtk3.so.0()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libfreerdp2.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgtk-vnc-2.0.so.0()(64bit) \
libsecret-1.so.0()(64bit) \
libspice-client-glib-2.0.so.8()(64bit) \
libspice-client-glib-2.0.so.8(SPICEGTK_1)(64bit) \
libspice-client-gtk-3.0.so.5()(64bit) \
libspice-client-gtk-3.0.so.5(SPICEGTK_1)(64bit) \
libvte-2.91.so.0()(64bit) \
libxml2.so.2()(64bit)"

inherit rpm
