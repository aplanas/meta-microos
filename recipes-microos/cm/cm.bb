SUMMARY = "Class polynomial computation via floating point approximations"
DESCRIPTION = "The CM software implements the construction of ring class fields of \
imaginary quadratic number fields and of elliptic curves with complex \
multiplication via floating point approximations."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.0+gb2b8d4bd"

RPM_NAME = "cm-0.4.0+gb2b8d4bd-1.4.aarch64.rpm"
RPM_HASH = "03abb098f4507c854c8f14c9d66194a6b4744ba115241d9738ef62be0811fcb744cfbc3ab43d2ee0efd35c299386279badad59a946b3b306cc7407768222ee6c"

RPROVIDES:${PN} += "cm cm(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcm.so.0()(64bit) libgmp.so.10()(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libmpfrcx.so.1()(64bit) libpari-gmp-tls.so.8()(64bit)"

inherit rpm
