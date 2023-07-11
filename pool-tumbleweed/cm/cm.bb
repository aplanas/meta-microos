SUMMARY = "Class polynomial computation via floating point approximations"
DESCRIPTION = "The CM software implements the construction of ring class fields of \
imaginary quadratic number fields and of elliptic curves with complex \
multiplication via floating point approximations."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.2"

RPM_NAME = "cm-0.4.2-1.1.aarch64.rpm"
RPM_HASH = "68f1e97023bfb82a3756e71c1c1d324364d2a06db3e2e69660eb9619ac0b2a4c34b0f15e4a93c4fa050eb63800fcc82ad792d4138a1ecac31080d03f7fb4f135"

RPROVIDES:${PN} += "cm"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcm.so.1 \
libflint.so.17 \
libgmp.so.10 \
libmpc.so.3 \
libmpfr.so.6 \
libmpfrcx.so.1 \
libpari-gmp-tls.so.8"

inherit rpm
