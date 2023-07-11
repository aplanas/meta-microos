SUMMARY = "Versatile Remote Desktop Client"
DESCRIPTION = "Remmina is a remote desktop client written in GTK+, aiming to be useful for \
system administrators and travellers, who need to work with lots of remote \
computers in front of either large monitors or tiny netbooks. Remmina supports \
multiple network protocols such as RDP, VNC, NX, XDMCP and SSH via separate \
plugins in an integrated and consistant user interface."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.31"

RPM_NAME = "remmina-1.4.31-1.1.aarch64.rpm"
RPM_HASH = "1472cde0baeeb9c273c8523ef031b4b441fc740364cb478342311e156b6620c4c679e0ecc9dc60262179fd16aa758a3b20dea6cbb28127ba88d2452a353d7d9e"

RPROVIDES:${PN} += "remmina \
remmina-plugins-common"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libappindicator3.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libavahi-ui-gtk3.so.0 \
libc.so.6 \
libcairo.so.2 \
libgcrypt.so.20 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjson-glib-1.0.so.0 \
libpango-1.0.so.0 \
libsodium.so.23 \
libssh.so.4 \
libvte-2.91.so.0"

inherit rpm
