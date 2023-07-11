SUMMARY = "Multi-precision floating-point interval arithmetic computation library"
DESCRIPTION = "The CM software implements the construction of ring class fields of \
imaginary quadratic number fields and of elliptic curves with complex \
multiplication via floating point approximations. \
 \
It includes libraries that can be called from within a C program."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.2"

RPM_NAME = "libcm1-0.4.2-1.1.aarch64.rpm"
RPM_HASH = "a44183d371ae50dff4c1d80bf2d81509e2de39158f594969c0d65efeb0f7da8b3ccf1cae94d94d6112d49b0aaebd0ae5b4c2353330a61ecb9ac3e61f8ba29b21"

RPROVIDES:${PN} += "libcm.so.1 \
libcm1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libflint.so.17 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libmpfrcx.so.1 \
libpari-gmp-tls.so.8 \
libz.so.1"

inherit rpm
