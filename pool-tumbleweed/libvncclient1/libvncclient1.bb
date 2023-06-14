SUMMARY = "Library implementing a VNC client"
DESCRIPTION = "LibVNCServer/LibVNCClient are cross-platform C libraries that allow \
implementing VNC server or client functionality in your program."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.13"

RPM_NAME = "libvncclient1-0.9.13-4.4.aarch64.rpm"
RPM_HASH = "6f585fd5a08cb038610c761063ed09d63e99419032d33d8c075dd24cc1cf7d6908a30c21f0f39f2b12ea7c791271f4c4501f86088c35a82837d2d5d8a7e0bc98"

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
