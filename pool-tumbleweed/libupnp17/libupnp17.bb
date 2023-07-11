SUMMARY = "An implementation of Universal Plug and Play (UPnP)"
DESCRIPTION = "The Portable Universal Plug and Play (UPnP) SDK provides support for building \
UPnP-compliant control points, devices, and bridges on several operating \
systems"
LICENSE = "BSD-3-Clause"

PV = "1.14.17"

RPM_NAME = "libupnp17-1.14.17-1.2.aarch64.rpm"
RPM_HASH = "baf75bea84e5b33a9b41aa00e7158433a5d4d1dfb0302b8f1164b1b9616e64e87e929318c0c8b03cf7a2c29ae147c6d74be3dbc76e27442f71f81050a0a18310"

RPROVIDES:${PN} += "libupnp.so.17 \
libupnp17"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libixml.so.11"

inherit rpm
