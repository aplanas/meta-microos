SUMMARY = "Signed Distance Fields viewer"
DESCRIPTION = "Signed Distance Fields viewer \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.0"

RPM_NAME = "ftsdf-2.13.0-4.1.aarch64.rpm"
RPM_HASH = "1f7d30fc39582694975ff614f2490a40a9af13e6b6cc24d7713809350240706f7ce65670c11a61717b747f7f31259945dd98852bcd097e469d49985dbe62408f"

RPROVIDES:${PN} += "ftsdf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libfreetype.so.6 \
libgobject-2.0.so.0 \
librsvg-2.so.2"

inherit rpm
