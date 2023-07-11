SUMMARY = "The Portable Universal Plug and Play (UPnP) SDK"
DESCRIPTION = "The Portable Universal Plug and Play (UPnP) SDK provides support for building \
UPnP-compliant control points, devices, and bridges on several operating \
systems."
LICENSE = "BSD-3-Clause"

PV = "1.14.17"

RPM_NAME = "libupnp-devel-1.14.17-1.2.aarch64.rpm"
RPM_HASH = "a7bc6a3a35b8260135da22f7aad1c87031f00db8faff5b8319ee40f3d469caa37654222f3d49c4cc4ccd63862b27ce199d0053e625e20461bd2e38383e727db0"

RPROVIDES:${PN} += "libixml-devel \
libupnp-devel \
pkgconfig-libupnp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libixml11 \
libupnp17"

inherit rpm
