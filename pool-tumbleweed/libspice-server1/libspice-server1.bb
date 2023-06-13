SUMMARY = "Library for SPICE-server"
DESCRIPTION = "Library for SPICE-server \
The SPICE server is used to expose a remote machine's display \
and devices."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "0.15.1"

RPM_NAME = "libspice-server1-0.15.1-1.4.aarch64.rpm"
RPM_HASH = "1d14af5543f67ea7c76b79258a1d4ec78dd9790302b68f63032a92e96798a924180f163c0a4158548b5d539f6bde2ea60f9fa49061def6ae4d182058d7f810a8"

RPROVIDES:${PN} += "libspice-server.so.1()(64bit) \
libspice-server1 \
libspice-server1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstapp-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libjpeg.so.8()(64bit) \
liblz4.so.1()(64bit) \
libm.so.6()(64bit) \
libopus.so.0()(64bit) \
liborc-0.4.so.0()(64bit) \
libpixman-1.so.0()(64bit) \
libsasl2.so.3()(64bit) \
libssl.so.3()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
