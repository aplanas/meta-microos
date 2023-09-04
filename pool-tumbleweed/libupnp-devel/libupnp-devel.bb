SUMMARY = "The Portable Universal Plug and Play (UPnP) SDK"
DESCRIPTION = "The Portable Universal Plug and Play (UPnP) SDK provides support for building \
UPnP-compliant control points, devices, and bridges on several operating \
systems."
LICENSE = "BSD-3-Clause"

PV = "1.14.18"

RPM_NAME = "libupnp-devel-1.14.18-1.1.aarch64.rpm"
RPM_HASH = "7ed6a4c466e228404a3ecee8375a6cf1abb8fcda6e548bf656162199a679770e719b4181e4da3e0dbb3532fd27536455cb13debd05b01ea0cce14ac9e46b2674"

RPROVIDES:${PN} += "libixml-devel \
libupnp-devel \
pkgconfig-libupnp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libixml11 \
libupnp17"

inherit rpm
