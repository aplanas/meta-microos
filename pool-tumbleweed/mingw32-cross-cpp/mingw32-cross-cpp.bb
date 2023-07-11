SUMMARY = "MinGW Windows cross-C Preprocessor"
DESCRIPTION = "MinGW Windows cross-C Preprocessor"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw32-cross-cpp-12.2.0-3.1.aarch64.rpm"
RPM_HASH = "06e7bc75891bf47cb955768bfdb5ba92b87fa0e536154f543ef4ec09459d73922deb67c8941bcc2735fb85a94f27c4da355dab3322eb14657a8dc1cb1d96fae1"

RPROVIDES:${PN} += "mingw32-cross-cpp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1"

inherit rpm
