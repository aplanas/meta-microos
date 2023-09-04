SUMMARY = "Standard library for baresip"
DESCRIPTION = "This package contains the shared library needed to run programs compiled with \
baresip"
LICENSE = "BSD-3-Clause"

PV = "2.10.0"

RPM_NAME = "libbaresip2-2.10.0-1.10.aarch64.rpm"
RPM_HASH = "d7a68a66648dd45a2e8fb506567bc1a9e540c20c5369dfa3569ae8e45710855c732b1d3154a75076c9d42fe569a328a02684fe900a8d059d9e2e13214a30d942"

RPROVIDES:${PN} += "baresip \
libbaresip.so.2 \
libbaresip2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libre.so.16 \
librem.so.4"

inherit rpm
