SUMMARY = "Computer algebra system"
DESCRIPTION = "A computer algebra system, compatible with existing CAS, as a C++ \
library with various user interfaces (GUI with formal spreadsheet and exact \
dynamic geometry, on-line, readline, emacs, texmacs...)."
LICENSE = "GPL-3.0-or-later"

PV = "1.9.0.27"

RPM_NAME = "giac-1.9.0.27-4.6.aarch64.rpm"
RPM_HASH = "70ec5d1e160cdb95082b1f61469207b806e083db51dcc5e925abd91aa0bcbfd6ef2afc07bf606ac92675d07f4158f90c80bfda779496685a0bdae581eaeb735b"

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
