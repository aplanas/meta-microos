SUMMARY = "A manual tiling window manager"
DESCRIPTION = "herbstluftwm is a manual tiling window manager for X11 using Xlib and Glib."
LICENSE = "BSD-2-Clause"

PV = "0.9.5"

RPM_NAME = "herbstluftwm-0.9.5-1.4.aarch64.rpm"
RPM_HASH = "eccaeb5e1629ca5bff5a77e6f05fe96fe355dcab95bb650bcbb5167dce79127df9d7d1b277feb1deb6cb0a5bb6e3b16529a08b4c34b43c8059d565ce53639b47"

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
