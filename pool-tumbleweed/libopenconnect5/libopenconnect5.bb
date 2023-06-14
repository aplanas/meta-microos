SUMMARY = "Libraries for openconnect"
DESCRIPTION = "This package provides a multi-protocol client for a number of SSL \
VPNs, including Cisco's 'AnyConnect' VPN."
LICENSE = "LGPL-2.1-or-later"

PV = "9.12"

RPM_NAME = "libopenconnect5-9.12-1.1.aarch64.rpm"
RPM_HASH = "3c8294f87d9d27298b64beaab61b5e2c10659a22fc5dbbbaec56db2f96b2db11c1a8dc9635cf99287be0fdc9c7eb94ef1a69df480a366f570847ea9e9c896a7f"

RPROVIDES:${PN} += "libopenconnect.so.5 \
libopenconnect5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libgnutls.so.30 \
libgssapi-krb5.so.2 \
libhogweed.so.6 \
liblz4.so.1 \
libm.so.6 \
libp11-kit.so.0 \
libpcsclite.so.1 \
libproxy.so.1 \
libpskc.so.0 \
libstoken.so.1 \
libxml2.so.2 \
libz.so.1"

inherit rpm
