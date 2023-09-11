SUMMARY = "A Minimalistic Text Based Status Bar"
DESCRIPTION = "Xmobar is a minimalistic text based status bar. \
 \
Inspired by the Ion3 status bar, it supports similar features, like dynamic \
color management, output templates, and extensibility through plugins."
LICENSE = "BSD-3-Clause"

PV = "0.46"

RPM_NAME = "xmobar-0.46-2.12.aarch64.rpm"
RPM_HASH = "9091953e1bec7b747808bd999202ff3195bc876db7c18ef74cbd1ba56aabb81d9a4cb05f37b3be8bfcee6d449a456812cc53d09ae68791d9b3bd4e0d5cd81ec5"

RPROVIDES:${PN} += "xmobar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXft.so.2 \
libXinerama.so.1 \
libXpm.so.4 \
libXrandr.so.2 \
libXrender.so.1 \
libXss.so.1 \
libasound.so.2 \
libc.so.6 \
libcairo.so.2 \
libffi.so.8 \
libglib-2.0.so.0 \
libgmp.so.10 \
libgobject-2.0.so.0 \
libharfbuzz.so.0 \
libm.so.6 \
libnuma.so.1 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpng16.so.16 \
libz.so.1"

inherit rpm
