SUMMARY = "String viewer"
DESCRIPTION = "String viewer \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.0"

RPM_NAME = "ftstring-2.13.0-4.1.aarch64.rpm"
RPM_HASH = "2cc2257d6b6cd492016b63f0aa26870ec982c11812c30575b9270c18b5157ce722ac107b3e002a61698636298715741a8028318b2ba174c4aedc59168b282507"

RPROVIDES:${PN} += "ftstring"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libfreetype.so.6 \
libgobject-2.0.so.0 \
libm.so.6 \
libpng16.so.16 \
librsvg-2.so.2"

inherit rpm
