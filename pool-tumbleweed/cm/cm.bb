SUMMARY = "Class polynomial computation via floating point approximations"
DESCRIPTION = "The CM software implements the construction of ring class fields of \
imaginary quadratic number fields and of elliptic curves with complex \
multiplication via floating point approximations."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.0+gb2b8d4bd"

RPM_NAME = "cm-0.4.0+gb2b8d4bd-1.4.aarch64.rpm"
RPM_HASH = "03abb098f4507c854c8f14c9d66194a6b4744ba115241d9738ef62be0811fcb744cfbc3ab43d2ee0efd35c299386279badad59a946b3b306cc7407768222ee6c"

RPROVIDES:${PN} += "cm"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcm.so.0 \
libgmp.so.10 \
libmpc.so.3 \
libmpfr.so.6 \
libmpfrcx.so.1 \
libpari-gmp-tls.so.8"

inherit rpm
