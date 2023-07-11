SUMMARY = "An implementation of VNC"
DESCRIPTION = "TigerVNC is an implementation of VNC (Virtual Network Computing), a \
client/server application that allows users to launch and interact \
with graphical applications on remote machines. TigerVNC is capable \
of running 3D and video applications. TigerVNC also provides \
extensions for advanced authentication methods and TLS encryption."
LICENSE = "GPL-2.0-only & MIT"

PV = "1.13.1"

RPM_NAME = "tigervnc-1.13.1-3.3.aarch64.rpm"
RPM_HASH = "9228a9f173ab0578b73ef928d7ba99d27f6b5e0ad0c33b7c07a88f41314b8b3c5210bec2d589de050d2f35f2af32749cd6aaa6258955f2edf30bc4f1b265f152"

RPROVIDES:${PN} += "tigervnc \
tightvnc \
vnc"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXi.so.6 \
libXrandr.so.2 \
libXrender.so.1 \
libc.so.6 \
libfltk-images.so.1.3 \
libfltk.so.1.3 \
libgcc-s.so.1 \
libgmp.so.10 \
libgnutls.so.30 \
libhogweed.so.6 \
libjpeg.so.8 \
libm.so.6 \
libnettle.so.8 \
libpixman-1.so.0 \
libstdc++.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
