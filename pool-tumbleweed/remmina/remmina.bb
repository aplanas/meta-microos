SUMMARY = "Versatile Remote Desktop Client"
DESCRIPTION = "Remmina is a remote desktop client written in GTK+, aiming to be useful for \
system administrators and travellers, who need to work with lots of remote \
computers in front of either large monitors or tiny netbooks. Remmina supports \
multiple network protocols such as RDP, VNC, NX, XDMCP and SSH via separate \
plugins in an integrated and consistant user interface."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.30"

RPM_NAME = "remmina-1.4.30-1.1.aarch64.rpm"
RPM_HASH = "d6e71b57c91ec84a25c6a2894e1c23bbc924d9b02741d8ca17a5d18f8b56661690b1559987ab84d57b882550060ee7a0d227bc19ad2d0d38db7f8bfdfdcb8efe"

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
