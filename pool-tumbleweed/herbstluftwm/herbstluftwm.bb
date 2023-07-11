SUMMARY = "A manual tiling window manager"
DESCRIPTION = "herbstluftwm is a manual tiling window manager for X11 using Xlib and Glib."
LICENSE = "BSD-2-Clause"

PV = "0.9.5"

RPM_NAME = "herbstluftwm-0.9.5-1.5.aarch64.rpm"
RPM_HASH = "d4a5aa045d9606bba55c4c49810eb3a46512e08ab562026754c861dcb7252878b047456cc842f789cc7f3c1a170a5245d3a8daf355505ea3e0ec0212905da4f5"

RPROVIDES:${PN} += "herbstluftwm"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXfixes.so.3 \
libXft.so.2 \
libXinerama.so.1 \
libXrandr.so.2 \
libXrender.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
