SUMMARY = "VNC module for X server"
DESCRIPTION = "This module allows to share content of X server's screen over VNC. \
It is loaded into X server as a module if enable in X server's \
configuration."
LICENSE = "GPL-2.0-only & MIT"

PV = "1.13.1"

RPM_NAME = "xorg-x11-Xvnc-module-1.13.1-3.1.aarch64.rpm"
RPM_HASH = "b9a80a46caca7b3f60198bb331ae6fe96918035d8afae0b8bae806d5bc7a8916e34e7032f385ff05f31a011824a30c40da58bbf5d1196fc0fb6dca8eb6aaefa7"

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
