SUMMARY = "A RADIUS client library"
DESCRIPTION = "The radcli library is a library for writing RADIUS Clients. The library's \
approach is to allow writing RADIUS-aware application in less than 50 lines \
of C code. It was based originally on freeradius-client and is source compatible \
with it."
LICENSE = "BSD-2-Clause & MIT"

PV = "1.3.1"

RPM_NAME = "libradcli5-1.3.1-1.3.aarch64.rpm"
RPM_HASH = "e1004cfaf831ec668a95ba73924016e75f89e8de02dee526d5c1ccf0b261dea448b4309e5e99cdfb436c37eebcd801dd9bee455caa4bd946421e941e685ce7a3"

RPROVIDES:${PN} += "libradcli.so.5 \
libradcli5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30 \
libnettle.so.8"

inherit rpm
