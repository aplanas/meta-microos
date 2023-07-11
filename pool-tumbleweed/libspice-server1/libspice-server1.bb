SUMMARY = "Library for SPICE-server"
DESCRIPTION = "Library for SPICE-server \
The SPICE server is used to expose a remote machine's display \
and devices."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "0.15.2"

RPM_NAME = "libspice-server1-0.15.2-1.1.aarch64.rpm"
RPM_HASH = "00bb82cff525ffeaf59ed62989ed4b8dc4ff74f7d9b6ee6b570942aeb08e358b9c7ffc87a0935eec12134ee4af760cf48fd4b1d3d7fe49f5654cf4a9f15d8142"

RPROVIDES:${PN} += "libspice-server.so.1 \
libspice-server1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstapp-1.0.so.0 \
libgstreamer-1.0.so.0 \
libjpeg.so.8 \
liblz4.so.1 \
libm.so.6 \
libopus.so.0 \
liborc-0.4.so.0 \
libpixman-1.so.0 \
libsasl2.so.3 \
libssl.so.3 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
