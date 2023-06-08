SUMMARY = "The core components of R"
DESCRIPTION = "This package provides the core of R, i.e. all that is in base."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.0"

RPM_NAME = "R-core-4.3.0-45.1.aarch64.rpm"
RPM_HASH = "d4569a3ac38d331dbca6163daebdfcd6c0c2c0d03dbfc26ba529657cf5f5e896e4b2fc743efd4b5d2eb4076620668814bb66bb0b96ed8ddba2c6e354f4d27bba"

RPROVIDES:${PN} += "R-core R-core(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/bash ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libR.so()(64bit) libRlapack.so()(64bit) libX11.so.6()(64bit) libXmu.so.6()(64bit) libXt.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libcurl.so.4()(64bit) libgobject-2.0.so.0()(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libtiff.so.6()(64bit) libtiff.so.6(LIBTIFF_4.0)(64bit)"

inherit rpm
