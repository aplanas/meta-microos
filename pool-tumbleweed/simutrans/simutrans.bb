SUMMARY = "Transport and Economic Simulation Game"
DESCRIPTION = "Simutrans is a transport and economic simulation with some ecological \
aspects. The goal of the game is to build an infrastructure which \
allows you to transport goods between the various industries and towns, \
and to support the towns with water and energy. A second goal is to \
become as rich as possible, but you will have to reinvest a good part \
of your earned money to expand your infrastructure network."
LICENSE = "Artistic-1.0"

PV = "123.0.1"

RPM_NAME = "simutrans-123.0.1-1.9.aarch64.rpm"
RPM_HASH = "07d49359170d71f60e46edb011a458c10ccde9a7a220c3e726f488e6bc6c14085885802df89545d938471e5909190db81881ae5b25ab8b2e34ecd3eeb40c4822"

RPROVIDES:${PN} += "simutrans"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libbz2.so.1 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
