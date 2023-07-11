SUMMARY = "Library implementing a VNC server"
DESCRIPTION = "LibVNCServer/LibVNCClient are cross-platform C libraries that allow \
implementing VNC server or client functionality in your program."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.14"

RPM_NAME = "libvncserver1-0.9.14-1.1.aarch64.rpm"
RPM_HASH = "d57d5b2359661e076f693fd960df09f97488e853254f2dd0d4786f566d62bc202fee134412d3c1359ab17dd8a0d72bbfa2939caa2ef254f121f0a8db23d18185"

RPROVIDES:${PN} += "libvncserver.so.1 \
libvncserver1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libgnutls.so.30 \
libjpeg.so.8 \
liblzo2.so.2 \
libpng16.so.16 \
libz.so.1"

inherit rpm
