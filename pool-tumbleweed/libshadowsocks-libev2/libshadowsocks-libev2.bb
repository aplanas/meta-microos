SUMMARY = "Libev port of Shadowsocks"
DESCRIPTION = "shadowsocks-libev is a lightweight secured SOCKS5 proxy for embedded devices and \
low-end boxes. \
 \
This package provides libraries for it."
LICENSE = "GPL-3.0-or-later"

PV = "3.3.5"

RPM_NAME = "libshadowsocks-libev2-3.3.5-3.2.aarch64.rpm"
RPM_HASH = "77fbc3acc244731dba3ec22d34906f688f1b1a1fdc8d23eb834444ce6605b09c8a5ea008489b12fdb6e7aeaf2adeec3d403cdad78ad5cc410bd2cb0d60f53dff"

RPROVIDES:${PN} += "libshadowsocks-libev.so.2 \
libshadowsocks-libev2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libev.so.4 \
libm.so.6 \
libmbedcrypto.so.7 \
libpcre.so.1 \
libsodium.so.23"

inherit rpm
