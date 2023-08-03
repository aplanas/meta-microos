SUMMARY = "Toolkit providing a common platform for event generators in C++"
DESCRIPTION = "ThePEG project is a toolkit for providing a common platform for using and \
building event generators in C++. \
 \
This package provides the shared libraries for ThePEG."
LICENSE = "GPL-2.0-only"

PV = "2.2.3"

RPM_NAME = "ThePEG-libs-2.2.3-1.10.aarch64.rpm"
RPM_HASH = "77d1b3865f0ae0d781ac2e8a5273a6d9682cb2985cd8f6a13a3f39e9ceac83f0b4cf45c18ef349949a2fe0c00f660a05d884e873ce1ad4cc7206d06bec0c9e2a"

RPROVIDES:${PN} += "ThePEG-libs \
config-ThePEG-libs \
libThePEG.so.30 \
libThePEG24"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libHepMC3.so.3 \
libLHAPDF-6.5.4.so \
libRivet-3.1.8.so \
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
