SUMMARY = "Session manager for VNC"
DESCRIPTION = "Session manager for VNC. It listens on VNC port and spawns Xvnc processes for incoming clients."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "vncmanager-1.0.2-11.2.aarch64.rpm"
RPM_HASH = "6c660e343757cdc9c4b5ba28ce9cd1b0a0a3d63b990212dc57e58dc72139232172f5a1b813c72ea1c39a25ca1ccefa9ce7841cb5825a73c27d85f4d58e78f93b"

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
