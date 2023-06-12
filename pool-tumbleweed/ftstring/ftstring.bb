SUMMARY = "String viewer"
DESCRIPTION = "String viewer \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.0"

RPM_NAME = "ftstring-2.13.0-4.1.aarch64.rpm"
RPM_HASH = "2cc2257d6b6cd492016b63f0aa26870ec982c11812c30575b9270c18b5157ce722ac107b3e002a61698636298715741a8028318b2ba174c4aedc59168b282507"

RPROVIDES:${PN} += "ftstring \
ftstring(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libfreetype.so.6()(64bit) \
libgobject-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
librsvg-2.so.2()(64bit)"

inherit rpm