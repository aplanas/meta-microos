SUMMARY = "Library implementing a VNC client"
DESCRIPTION = "LibVNCServer/LibVNCClient are cross-platform C libraries that allow \
implementing VNC server or client functionality in your program."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.14"

RPM_NAME = "libvncclient1-0.9.14-1.1.aarch64.rpm"
RPM_HASH = "68e8baf4f485939dc0dc95409d11adc2fe3288f903c16bbb898c8bb843ead091326390c37699916dea94e2b3e1c8962862c2b1779dd39ee0bdb9ff1c1a80f66a"

RPROVIDES:${PN} += "libvncclient.so.1 \
libvncclient1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libgnutls.so.30 \
libjpeg.so.8 \
liblzo2.so.2 \
libz.so.1"

inherit rpm
