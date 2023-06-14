SUMMARY = "A Minimalistic Text Based Status Bar"
DESCRIPTION = "Xmobar is a minimalistic text based status bar. \
 \
Inspired by the Ion3 status bar, it supports similar features, like dynamic \
color management, output templates, and extensibility through plugins."
LICENSE = "BSD-3-Clause"

PV = "0.46"

RPM_NAME = "xmobar-0.46-2.4.aarch64.rpm"
RPM_HASH = "162c1848fa03ae5d7c36648a3bf4160c1337944750db978761f6dfddcb7865bbbcc253e9ac29bb10fb79705a8fd69cf0f8f62905e3ffa546d069a8b3e9651bfa"

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
libatomic.so.1 \
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
