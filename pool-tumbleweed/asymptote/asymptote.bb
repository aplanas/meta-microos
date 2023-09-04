SUMMARY = "2D & 3D TeX-Aware vector graphics language"
DESCRIPTION = "Asymptote is a descriptive vector graphics language for technical \
drawing, inspired by MetaPost, but with a C++-like syntax. Asymptote \
provides for figures the same quality of typesetting that LaTeX does \
for scientific text."
LICENSE = "LGPL-3.0-or-later"

PV = "2.86"

RPM_NAME = "asymptote-2.86-1.1.aarch64.rpm"
RPM_HASH = "edcaf6f1cb041f60cdf7802066d96f374f3de38781c67a8f2e39cb96af1dc9601c3b5b1083f03550074767ca6b88454dc6ed3a36d915fdabd1f449983aeb971e"

RPROVIDES:${PN} += "asymptote"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLX.so.0 \
libc.so.6 \
libfftw3.so.3 \
libgc.so.1 \
libgcc-s.so.1 \
libglut.so.3 \
libgsl.so.27 \
libgslcblas.so.0 \
libm.so.6 \
libreadline.so.8 \
libstdc++.so.6 \
libtinfo.so.6 \
libtirpc.so.3 \
libz.so.1"

inherit rpm
