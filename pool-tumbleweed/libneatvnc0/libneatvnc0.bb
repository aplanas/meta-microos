SUMMARY = "A VNC server library"
DESCRIPTION = "A VNC server library."
LICENSE = "ISC"

PV = "0.6.0"

RPM_NAME = "libneatvnc0-0.6.0-1.5.aarch64.rpm"
RPM_HASH = "945556b983143ed8308b027df53526f11570ac35a2cef31f2a2336cd2589f07050b35f58b7bda08f97a954d9c34e459ee406cf2ffefec9dada0c956b77cbd3c3"

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
