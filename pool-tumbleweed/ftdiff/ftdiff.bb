SUMMARY = "Compare font hinting modes"
DESCRIPTION = "Compare font hinting modes \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.1"

RPM_NAME = "ftdiff-2.13.1-1.1.aarch64.rpm"
RPM_HASH = "0dc0a603f43ee1a5f3bc726f923cef7543e562d04bf6e575ec519e8eec7d73c7aec7f2df7581517126985ba8c170c8bced427f15087d38f7d68ff8d57769a8d0"

RPROVIDES:${PN} += "ftdiff"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libfreetype.so.6 \
librsvg-2.so.2"

inherit rpm
