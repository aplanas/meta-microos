SUMMARY = "Package provides recommended R-Matrix"
DESCRIPTION = "This packages provides R-Matrix, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "1.5.4"

RPM_NAME = "R-Matrix-1.5.4-46.1.aarch64.rpm"
RPM_HASH = "e35719a1e4fce8e28021d317110a9dfcf39165992eca37bffdc4cc91eb0a5fde8aae55c2f3e88b9524eb24f98bd3a253735ac02b54946586a5785a685777a6d1"

RPROVIDES:${PN} += "R-Matrix \
R-Matrix-devel"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1 \
libR.so \
libRblas.so \
libRlapack.so \
libc.so.6 \
libm.so.6"

inherit rpm
