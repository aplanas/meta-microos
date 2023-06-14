SUMMARY = "A VNC server library"
DESCRIPTION = "A VNC server library."
LICENSE = "ISC"

PV = "0.6.0"

RPM_NAME = "libneatvnc0-0.6.0-1.4.aarch64.rpm"
RPM_HASH = "0f39a62c11e7ffbe70d19d044d06a5f9c480ad51f3693e5c292f7c707b07e6e3f326b43da841180c46d9d0d0fc6a064432fbd026ffd056d6f85e7d4759502226"

RPROVIDES:${PN} += "libneatvnc.so.0 \
libneatvnc0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaml.so.0 \
libavcodec.so.60 \
libavfilter.so.9 \
libavutil.so.58 \
libc.so.6 \
libdrm.so.2 \
libgbm.so.1 \
libgnutls.so.30 \
libpixman-1.so.0 \
libturbojpeg.so.0 \
libz.so.1"

inherit rpm
