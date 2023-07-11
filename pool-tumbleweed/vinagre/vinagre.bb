SUMMARY = "VNC client for GNOME"
DESCRIPTION = "Vinagre is a VNC client for GNOME that supports connecting to multiple \
machines, browsing for VNC servers via avahi and password storage in \
gnome-keyring."
LICENSE = "GPL-3.0-or-later"

PV = "3.22.0"

RPM_NAME = "vinagre-3.22.0-15.11.aarch64.rpm"
RPM_HASH = "f4ad8d08e03d43e6f2273f33468898ed4ece4999e0600fc7ad5a51b477413764c2cedc65399128eb220b89e5d514ee89fa74bf22d61352f905461b3659e3d3e1"

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
