SUMMARY = "VNC module for X server"
DESCRIPTION = "This module allows to share content of X server's screen over VNC. \
It is loaded into X server as a module if enable in X server's \
configuration."
LICENSE = "GPL-2.0-only & MIT"

PV = "1.13.1"

RPM_NAME = "xorg-x11-Xvnc-module-1.13.1-3.3.aarch64.rpm"
RPM_HASH = "aecfb275ecc27253870347d6a51d48a2c38f2635caed548c92f062eb9c8f16d53642b4f9e12ef45a949ce9d0c6548e5c1ef4728e722fa6aa0560197275a37b4d"

RPROVIDES:${PN} += "libvnc.so \
xorg-x11-Xvnc-module"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libgnutls.so.30 \
libhogweed.so.6 \
libjpeg.so.8 \
libnettle.so.8 \
libpam.so.0 \
libpixman-1.so.0 \
libstdc++.so.6 \
libz.so.1 \
xorg-x11-Xvnc"

inherit rpm
