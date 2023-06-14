SUMMARY = "An implementation of Universal Plug and Play (UPnP)"
DESCRIPTION = "The Portable Universal Plug and Play (UPnP) SDK provides support for building \
UPnP-compliant control points, devices, and bridges on several operating \
systems"
LICENSE = "BSD-3-Clause"

PV = "1.14.17"

RPM_NAME = "libupnp17-1.14.17-1.1.aarch64.rpm"
RPM_HASH = "f5dbf4d60bcdf85aec8ecc693596c6c91f754c159a4bc7533a77e0b4f1b242bf32b6a023fcd1560c5013744e0d30ba36851ee26ff5ea33122e4a9dd2dad9177b"

RPROVIDES:${PN} += "libupnp.so.17 \
libupnp17"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libixml.so.11"

inherit rpm
