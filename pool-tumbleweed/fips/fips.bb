SUMMARY = "OpenGL-based FITS image viewer"
DESCRIPTION = "FIPS is a cross-platform FITS viewer with responsive user interface. Unlike \
other FITS viewers FIPS uses GPU hardware via OpenGL to provide usual \
functionality such as zooming, panning and level adjustments. OpenGL 2.1 and \
later is supported. \
 \
FIPS supports all 2D image formats except of 64-bit floating point numbers \
(BITPIX=-64). FITS image extension has basic limited support."
LICENSE = "LGPL-3.0-only"

PV = "3.4.0"

RPM_NAME = "fips-3.4.0-1.16.aarch64.rpm"
RPM_HASH = "4d15587ad0770d33c42306709c8b93d2591690b75ab4508cc2a1f1904f1fdab933d234861f12e2442399183b1c8f20e68c7c9faee366c41af0d499c509dde11d"

RPROVIDES:${PN} += "application() \
application(space.fips.Fips.desktop) \
fips \
fips(aarch-64) \
metainfo() \
metainfo(space.fips.Fips.metainfo.xml) \
mimehandler(application/fits) \
mimehandler(image/fits)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit)"

inherit rpm
