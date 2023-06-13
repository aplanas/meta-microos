SUMMARY = "Program to compute symmetric power elliptic curve L-functions"
DESCRIPTION = "SYMPOW is a mathematical program to compute special values of \
symmetric power elliptic curve L-functions; it can compute up to \
about 64 digits of precision."
LICENSE = "BSD-2-Clause"

PV = "2.023.6"

RPM_NAME = "sympow-2.023.6-1.11.aarch64.rpm"
RPM_HASH = "3d75eb0d327f68e95e4e6232f2dcf8509b1202bc1c60fe7de6be0d960d150e97df3fe3a40d4be81e2a290ae8aa4e48370e5e4da74479744bfbfffedce603f03f"

RPROVIDES:${PN} += "sympow \
sympow(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
grep \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
pari-gp \
sed"

inherit rpm
