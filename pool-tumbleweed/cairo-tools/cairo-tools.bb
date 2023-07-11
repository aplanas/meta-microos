SUMMARY = "Utilities for cairo, a Vector Graphics Library with Cross-Device Output Support"
DESCRIPTION = "Cairo is a vector graphics library with cross-device output support. \
Currently supported output targets include the X Window System, \
in-memory image buffers, and PostScript. Cairo is designed to produce \
identical output on all output media while taking advantage of display \
hardware acceleration when available. \
 \
This package contains various cairo utilities."
LICENSE = "GPL-3.0-or-later"

PV = "1.17.8"

RPM_NAME = "cairo-tools-1.17.8-1.2.aarch64.rpm"
RPM_HASH = "aeccc28a3f66a89f4234a7d244cd122ecd575701a641a0ebaf75801c8c29771bfbf4d650e2c3ded1547ed35d49b286fc8901a49e129c3b7dd01627e6b053cb37"

RPROVIDES:${PN} += "cairo-tools \
cairo-utils \
libcairo-fdr.so \
libcairo-sphinx.so \
libcairo-trace.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXrender.so.1 \
libc.so.6 \
libcairo-script-interpreter.so.2 \
libcairo.so.2 \
libcairo2 \
libglib-2.0.so.0 \
libpixman-1.so.0 \
libxcb-render.so.0 \
libxcb.so.1 \
libz.so.1"

inherit rpm
