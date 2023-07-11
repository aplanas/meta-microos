SUMMARY = "String viewer"
DESCRIPTION = "String viewer \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.0"

RPM_NAME = "ftstring-2.13.0-4.2.aarch64.rpm"
RPM_HASH = "b3e83703529a6f3fd20eee7470bf2f3511f20c86be9f7d5cf485d1cd1658d894b73bafa4174f18ae20db70c1d59669e9b439a989aed85d2c24a4e7bf211a76ac"

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
