SUMMARY = "The core components of R"
DESCRIPTION = "This package provides the core of R, i.e. all that is in base."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.0"

RPM_NAME = "R-core-4.3.0-45.2.aarch64.rpm"
RPM_HASH = "6fa9f8e7e4c3c0f92d2e3bc20a3d70989dabcffe13029940a20b28a1b00eaf6164a8c70bc80d3dc4a97a8fb7d37053f9eb90d9c1faa06573e69b68657f3b1250"

RPROVIDES:${PN} += "R-core R-core(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/bash ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libR.so()(64bit) libRlapack.so()(64bit) libX11.so.6()(64bit) libXmu.so.6()(64bit) libXt.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libcurl.so.4()(64bit) libgobject-2.0.so.0()(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libtiff.so.6()(64bit) libtiff.so.6(LIBTIFF_4.0)(64bit)"

inherit rpm
