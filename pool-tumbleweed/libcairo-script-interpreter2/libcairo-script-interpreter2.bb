SUMMARY = "Vector Graphics Library with Cross-Device Output Support"
DESCRIPTION = "Cairo is a vector graphics library with cross-device output support. \
Currently supported output targets include the X Window System, \
in-memory image buffers, and PostScript. Cairo is designed to produce \
identical output on all output media while taking advantage of display \
hardware acceleration when available."
LICENSE = "LGPL-2.1-or-later | MPL-1.1"

PV = "1.17.8"

RPM_NAME = "libcairo-script-interpreter2-1.17.8-1.2.aarch64.rpm"
RPM_HASH = "c74ba4b2cf9cb4dcd88c5f12e0526f415fb29713fde4e900b294f16fba9c17c7570e9895a5e0524f661219b7645f25692ca6b6126dff62c49cf7c7afaf5e8363"

RPROVIDES:${PN} += "libcairo-script-interpreter.so.2 \
libcairo-script-interpreter2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libfontconfig.so.1 \
libfreetype.so.6 \
libm.so.6 \
libz.so.1"

inherit rpm
