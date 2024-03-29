SUMMARY = "Simple userland wrapper around kernel tap devices"
DESCRIPTION = "This is an over-engineered commodity library to manage a pool \
of tap devices and provides the basic \
pre-up.d/up.d/down.d/post-down.d infrastructure."
LICENSE = "GPL-2.0+ & LGPL-2.1+"

PV = "1.21"

RPM_NAME = "libnozzle1-1.21-1.10.aarch64.rpm"
RPM_HASH = "70f649b7ce948edc7c982c81543317d1551acd38744eea512ab2e18e0e583d3878e2651443dd059b488cc54c3a4b5cf8ae55c84449baa419fe66a1826c40a31c"

RPROVIDES:${PN} += "libnozzle.so.1 \
libnozzle1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnl-3.so.200 \
libnl-route-3.so.200"

inherit rpm
