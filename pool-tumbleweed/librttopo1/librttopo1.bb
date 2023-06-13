SUMMARY = "RT Topology Library"
DESCRIPTION = "The RT Topology Library exposes an API to create and manage standard \
(ISO 13249 aka SQL/MM) topologies using user-provided [data stores]"
LICENSE = "GPL-2.0-or-later"

PV = "1.1.0"

RPM_NAME = "librttopo1-1.1.0-2.4.aarch64.rpm"
RPM_HASH = "06eb908970692b09cf98388b7b47ba4fb0bd552b9e740c32b02a3ffcc1a0f68c21eebc98052ff5cf775d5e346a3a8ba115053436018a8930a93c0aa8c79db133"

RPROVIDES:${PN} += "librttopo.so.1()(64bit) \
librttopo1 \
librttopo1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgeos_c.so.1()(64bit) \
libm.so.6()(64bit)"

inherit rpm
