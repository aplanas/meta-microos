SUMMARY = "Package providing R-core graphics devices in R-grDevices"
DESCRIPTION = "This package provides R-grDevices, one of R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.0"

RPM_NAME = "R-grDevices-4.3.0-45.1.aarch64.rpm"
RPM_HASH = "608ad3d8055f68537b8a6444d40285a9c5cfb4eeee9591dbca83f3a5935948523cfcf0e5554856ccbf5516d33db33fad7126f9186d8eac515df29a0665457415"

RPROVIDES:${PN} += "R-grDevices R-grDevices(aarch-64)"
RDEPENDS:${PN} += "R-base ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libR.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libcairo.so.2()(64bit) libgobject-2.0.so.0()(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libtiff.so.6()(64bit) libtiff.so.6(LIBTIFF_4.0)(64bit) libz.so.1()(64bit)"

inherit rpm
