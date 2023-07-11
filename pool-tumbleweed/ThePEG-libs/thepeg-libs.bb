SUMMARY = "Toolkit providing a common platform for event generators in C++"
DESCRIPTION = "ThePEG project is a toolkit for providing a common platform for using and \
building event generators in C++. \
 \
This package provides the shared libraries for ThePEG."
LICENSE = "GPL-2.0-only"

PV = "2.2.3"

RPM_NAME = "ThePEG-libs-2.2.3-1.9.aarch64.rpm"
RPM_HASH = "233753604f8e6e0175b1ac5f705116d099b1c6ed76c7993da3af47c1b6425e7d7e94be6f4f5807dae0a15d1815c976b08e515b3ca8704161447769464a61dded"

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
