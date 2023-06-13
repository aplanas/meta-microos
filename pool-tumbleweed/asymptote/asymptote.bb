SUMMARY = "2D & 3D TeX-Aware vector graphics language"
DESCRIPTION = "Asymptote is a descriptive vector graphics language for technical \
drawing, inspired by MetaPost, but with a C++-like syntax. Asymptote \
provides for figures the same quality of typesetting that LaTeX does \
for scientific text."
LICENSE = "LGPL-3.0-or-later"

PV = "2.83"

RPM_NAME = "asymptote-2.83-1.4.aarch64.rpm"
RPM_HASH = "d863cbc143e902a89caded9a006078bc45848577d14ad53d523dbe59ade949fe9a4140ed916140ec971e1ac6de91808a497bedf9464a52a714c1c08a5e84364d"

RPROVIDES:${PN} += "asymptote \
asymptote(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
libGL.so.1()(64bit) \
libGLX.so.0()(64bit) \
libc.so.6()(64bit) \
libfftw3.so.3()(64bit) \
libgc.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libglut.so.3()(64bit) \
libgsl.so.27()(64bit) \
libgslcblas.so.0()(64bit) \
libm.so.6()(64bit) \
libreadline.so.8()(64bit) \
libstdc++.so.6()(64bit) \
libtinfo.so.6()(64bit) \
libtirpc.so.3()(64bit) \
libz.so.1()(64bit)"

inherit rpm
