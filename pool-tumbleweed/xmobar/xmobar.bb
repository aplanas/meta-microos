SUMMARY = "A Minimalistic Text Based Status Bar"
DESCRIPTION = "Xmobar is a minimalistic text based status bar. \
 \
Inspired by the Ion3 status bar, it supports similar features, like dynamic \
color management, output templates, and extensibility through plugins."
LICENSE = "BSD-3-Clause"

PV = "0.46"

RPM_NAME = "xmobar-0.46-2.6.aarch64.rpm"
RPM_HASH = "62c7e9e3d1d56b90a0d5aab5308640478ace5319dd9fc69c56f1141981bfeca607756ad5a3fcc3bb52d77943fb3ac4103a63e0e27651c54e247b8bd8ffe01989"

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
