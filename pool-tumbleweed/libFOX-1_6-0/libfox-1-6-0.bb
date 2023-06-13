SUMMARY = "Shared libraries for the FOX toolkit 1.6"
DESCRIPTION = "This package contains the shared libraries needed \
by applications compiled with the FOX GUI Toolkit."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.57"

RPM_NAME = "libFOX-1_6-0-1.6.57-4.1.aarch64.rpm"
RPM_HASH = "54b2862b8fc6cca952277b27daeef7c9af44075004bf600d469225ff84724fb9a47c077d8af5bb6509ad4dd739304c321bed17c01c3499632036cb033378c81a"

RPROVIDES:${PN} += "fox \
libCHART-1.6.so.0()(64bit) \
libFOX-1.6.so.0()(64bit) \
libFOX-1_6-0 \
libFOX-1_6-0(aarch-64) \
libfox1_6"

RDEPENDS:${PN} += "/sbin/ldconfig \
libGL.so.1()(64bit) \
libGLU.so.1()(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXft.so.2()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libtiff.so.6()(64bit) \
libtiff.so.6(LIBTIFF_4.0)(64bit) \
libz.so.1()(64bit)"

inherit rpm
