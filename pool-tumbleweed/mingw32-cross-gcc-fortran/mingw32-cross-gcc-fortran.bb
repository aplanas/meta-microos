SUMMARY = "MinGW Windows cross-compiler for Fortran"
DESCRIPTION = "MinGW Windows cross-compiler for Fortran"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw32-cross-gcc-fortran-12.2.0-3.1.aarch64.rpm"
RPM_HASH = "bc41185f294687ed601d6a919cacff8adbe784bd39b93683f215d97917cd31e83da0e35150033b5067eb7e10262bb6c2ecc7c16ab6e9f7040a5549b0c72c2f7b"

RPROVIDES:${PN} += "mingw32-cross-gcc-fortran"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1"

inherit rpm
