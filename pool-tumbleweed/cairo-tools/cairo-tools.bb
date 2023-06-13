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

RPM_NAME = "cairo-tools-1.17.8-1.1.aarch64.rpm"
RPM_HASH = "ca3892da2cc09bf445314924676ee04533c0ae3c50cfad0bb9fab26238fdd62f9e10d29b312fe45c5501e139013bc7575319da157a529e9f1a4793fbdf626d4a"

RPROVIDES:${PN} += "cairo-tools \
cairo-tools(aarch-64) \
cairo-utils \
libcairo-fdr.so()(64bit) \
libcairo-sphinx.so()(64bit) \
libcairo-trace.so()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libXrender.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo-script-interpreter.so.2()(64bit) \
libcairo.so.2()(64bit) \
libcairo2 \
libglib-2.0.so.0()(64bit) \
libpixman-1.so.0()(64bit) \
libxcb-render.so.0()(64bit) \
libxcb.so.1()(64bit) \
libz.so.1()(64bit)"

inherit rpm
