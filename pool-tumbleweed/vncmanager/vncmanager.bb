SUMMARY = "Session manager for VNC"
DESCRIPTION = "Session manager for VNC. It listens on VNC port and spawns Xvnc processes for incoming clients."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "vncmanager-1.0.2-11.3.aarch64.rpm"
RPM_HASH = "7f222ea4c605f890bf333d374b0c942ba1fd7af6cd2a63a5dbf237f87316be244d4773a686a1ad6873ce9e8205475d09ef089dd7d316caa5cc819348fb77a975"

RPROVIDES:${PN} += "vncmanager"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libboost-iostreams.so.1.82.0 \
libboost-program-options.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libgnutls.so.30 \
libstdc++.so.6 \
vncmanager-greeter \
xorg-x11-Xvnc \
xorg-x11-Xvnc-/usr/lib/vnc/with-vnc-key.sh"

inherit rpm
