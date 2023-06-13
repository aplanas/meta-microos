SUMMARY = "A manual tiling window manager"
DESCRIPTION = "herbstluftwm is a manual tiling window manager for X11 using Xlib and Glib."
LICENSE = "BSD-2-Clause"

PV = "0.9.5"

RPM_NAME = "herbstluftwm-0.9.5-1.4.aarch64.rpm"
RPM_HASH = "eccaeb5e1629ca5bff5a77e6f05fe96fe355dcab95bb650bcbb5167dce79127df9d7d1b277feb1deb6cb0a5bb6e3b16529a08b4c34b43c8059d565ce53639b47"

RPROVIDES:${PN} += "herbstluftwm \
herbstluftwm(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXfixes.so.3()(64bit) \
libXft.so.2()(64bit) \
libXinerama.so.1()(64bit) \
libXrandr.so.2()(64bit) \
libXrender.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
