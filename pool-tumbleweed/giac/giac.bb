SUMMARY = "Computer algebra system"
DESCRIPTION = "A computer algebra system, compatible with existing CAS, as a C++ \
library with various user interfaces (GUI with formal spreadsheet and exact \
dynamic geometry, on-line, readline, emacs, texmacs...)."
LICENSE = "GPL-3.0-or-later"

PV = "1.9.0.27"

RPM_NAME = "giac-1.9.0.27-4.5.aarch64.rpm"
RPM_HASH = "26415d47b11c1b4a4dd2695b28b66bbb990b7eeed3e86c46d482d96506360817a4e09a25f7eb776f0aeb8d26f1f4741dbad21dc41d628ef054c3a4648e8fe58f"

RPROVIDES:${PN} += "giac"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libc.so.6 \
libfltk-gl.so.1.3 \
libfltk-images.so.1.3 \
libfltk.so.1.3 \
libgcc-s.so.1 \
libgiac.so.0 \
libgmp.so.10 \
libgsl.so.27 \
libm.so.6 \
libpng16.so.16 \
libreadline.so.8 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
