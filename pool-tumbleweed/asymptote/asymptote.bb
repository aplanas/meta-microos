SUMMARY = "2D & 3D TeX-Aware vector graphics language"
DESCRIPTION = "Asymptote is a descriptive vector graphics language for technical \
drawing, inspired by MetaPost, but with a C++-like syntax. Asymptote \
provides for figures the same quality of typesetting that LaTeX does \
for scientific text."
LICENSE = "LGPL-3.0-or-later"

PV = "2.83"

RPM_NAME = "asymptote-2.83-1.5.aarch64.rpm"
RPM_HASH = "2bc65f5596f8aa0123b7f33dc34481a21abab222895ef15c763dd9a094e0fc26b023d3e3552931a00f01449187fc051f1619652b34f746483fe2ea254f73e6ff"

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
