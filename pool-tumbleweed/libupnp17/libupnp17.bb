SUMMARY = "An implementation of Universal Plug and Play (UPnP)"
DESCRIPTION = "The Portable Universal Plug and Play (UPnP) SDK provides support for building \
UPnP-compliant control points, devices, and bridges on several operating \
systems"
LICENSE = "BSD-3-Clause"

PV = "1.14.18"

RPM_NAME = "libupnp17-1.14.18-1.1.aarch64.rpm"
RPM_HASH = "b2eef87def294892d8f20cf980e2c82f4844b135145333cecebb170ff66344acd3af9383a61986c35edd200da066d0d9ccf5db639b0ae3cb25884507c06c3872"

RPROVIDES:${PN} += "libupnp.so.17 \
libupnp17"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libixml.so.11"

inherit rpm
