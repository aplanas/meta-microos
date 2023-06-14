SUMMARY = "Toolkit providing a common platform for event generators in C++"
DESCRIPTION = "ThePEG project is a toolkit for providing a common platform for using and \
building event generators in C++. \
 \
This package provides the shared libraries for ThePEG."
LICENSE = "GPL-2.0-only"

PV = "2.2.3"

RPM_NAME = "ThePEG-libs-2.2.3-1.8.aarch64.rpm"
RPM_HASH = "6e5fa252719e095934bd2134aa04bc8c87d808501def770e36709e569f60e29dd0697dfd2fc505103ff10fc3885cda2d78c7c08728db134b1f770f17cd46528e"

RPROVIDES:${PN} += "ThePEG-libs \
config-ThePEG-libs \
libThePEG.so.30 \
libThePEG24"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libHepMC3.so.3 \
libLHAPDF-6.5.4.so \
libRivet-3.1.7.so \
libc.so.6 \
libfastjet.so.0 \
libgcc-s.so.1 \
libgmp.so.10 \
libgsl.so.27 \
libgslcblas.so.0 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
