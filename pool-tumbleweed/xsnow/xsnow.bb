SUMMARY = "A Christmas Animation"
DESCRIPTION = "Xsnow is an application that animates snowfall, Santa and some scenery on your desktop. \
It is NOT a kind of screen saver: snow is falling, Santa rides his sleigh with reindeer \
while you are using your system. \
Xsnow runs on most varieties of Linux, and probably on other Unix systems as well. \
 \
Xsnow is derived from Rick Jansen's xsnow-1.42."
LICENSE = "GPL-3.0-or-later"

PV = "3.7.4"

RPM_NAME = "xsnow-3.7.4-1.1.aarch64.rpm"
RPM_HASH = "15531182adea2445d6500ffd1ec11c84df848664792bbe7cc4893777e84ce59a47dec0dc441c9c907d368d9e9166b237a56b49a6b26e2b639ed834f0cc344e3b"

RPROVIDES:${PN} += "xsnow"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXinerama.so.1 \
libXpm.so.4 \
libXtst.so.6 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgsl.so.27 \
libgslcblas.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libstdc++.so.6 \
libxkbcommon.so.0"

inherit rpm
