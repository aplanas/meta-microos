SUMMARY = "Signed Distance Fields viewer"
DESCRIPTION = "Signed Distance Fields viewer \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.0"

RPM_NAME = "ftsdf-2.13.0-4.2.aarch64.rpm"
RPM_HASH = "a712d0f342741a14bbe4d8003cbf971a7c3c13ee8eb34b735ea0105153be75b8c3419c616a4d2ee3263375513a306a167c988d9e099a7d7170af5fef213ece63"

RPROVIDES:${PN} += "ftsdf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libfreetype.so.6 \
libgobject-2.0.so.0 \
librsvg-2.so.2"

inherit rpm
