SUMMARY = "A real-time, excessive clone of Worms"
DESCRIPTION = "Based on Liero gameplay, OpenLierox is an extremely addictive realtime worms \
shoot-em-up backed by an active gamers community. Dozens of levels and mods \
are available to provide endless gaming pleasure."
LICENSE = "LGPL-2.0-or-later"

PV = "0.58_rc5"

RPM_NAME = "openlierox-0.58_rc5-4.2.aarch64.rpm"
RPM_HASH = "4366f15f2523fcfbe318b8885117a0996ff8abd56c336b946fbaa9de863640d1561fa5c41804876059a1ebdd393e07b65c28cf4b7edaed36b83ebb4cba7d42ce"

RPROVIDES:${PN} += "OpenLieroX \
openlierox"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libSDL-image-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libX11.so.6 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libgd.so.3 \
libm.so.6 \
libstdc++.so.6 \
libxml2.so.2 \
libz.so.1 \
libzip.so.5"

inherit rpm
