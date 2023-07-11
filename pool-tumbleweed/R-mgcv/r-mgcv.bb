SUMMARY = "Package provides recommended R-mgcv"
DESCRIPTION = "This packages provides R-mgcv, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "1.8.42"

RPM_NAME = "R-mgcv-1.8.42-46.1.aarch64.rpm"
RPM_HASH = "38c671ed9a7adc5ee8ed317c367a4d9435dc2b8ccb3f89f22dcd1ba4f504888378f123ca20ccab6a9a49d5eb64a1e77d0825059540c9db63f45644a907d0d0ed"

RPROVIDES:${PN} += "R-mgcv"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1 \
libR.so \
libRblas.so \
libRlapack.so \
libc.so.6 \
libgomp.so.1 \
libm.so.6"

inherit rpm
