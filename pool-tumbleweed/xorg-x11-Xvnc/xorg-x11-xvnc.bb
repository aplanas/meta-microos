SUMMARY = "TigerVNC implementation of Xvnc"
DESCRIPTION = "This is the TigerVNC implementation of Xvnc."
LICENSE = "GPL-2.0-only & MIT"

PV = "1.13.1"

RPM_NAME = "xorg-x11-Xvnc-1.13.1-3.1.aarch64.rpm"
RPM_HASH = "31affeffc9207b61260cd0717718549345365c38258520656640c2a010b00543e5e3bfeb26fd7214563cbd9069ce9b9de7fa2118b2a965e35fb406e3062e18bb"

RPROVIDES:${PN} += "config-xorg-x11-Xvnc \
group-vnc \
tightvnc \
user-vnc \
xorg-x11-Xvnc \
xorg-x11-Xvnc-/usr/lib/vnc/with-vnc-key.sh"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/bash \
/usr/bin/hostname \
/usr/bin/perl \
/usr/bin/sh \
dbus-1-x11 \
group-shadow \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libXau.so.6 \
libXdamage.so.1 \
libXdmcp.so.6 \
libXext.so.6 \
libXfixes.so.3 \
libXfont2.so.2 \
libXrandr.so.2 \
libXtst.so.6 \
libXvnc.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libgnutls.so.30 \
libhogweed.so.6 \
libjpeg.so.8 \
libm.so.6 \
libnettle.so.8 \
libpam.so.0 \
libpixman-1.so.0 \
libstdc++.so.6 \
libsystemd.so.0 \
libz.so.1 \
openssl-cli \
systemd \
sysuser-shadow \
windowmanager \
xauth \
xinit \
xkbcomp \
xkeyboard-config \
xorg-x11-fonts-core"

inherit rpm
