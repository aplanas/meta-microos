SUMMARY = "Library for SPICE-server"
DESCRIPTION = "Library for SPICE-server \
The SPICE server is used to expose a remote machine's display \
and devices."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "0.15.2"

RPM_NAME = "libspice-server1-0.15.2-2.1.aarch64.rpm"
RPM_HASH = "08f32fd074ba38fd7c54498e64a4e9e0917fde69c5ad5c3c5003cf6913b038819becd885c882b2c1425afc11535a3ce59ba8f28a4940c6e4a0b130b327d908cc"

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
