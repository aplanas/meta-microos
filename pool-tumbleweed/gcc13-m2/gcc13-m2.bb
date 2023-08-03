SUMMARY = "GNU Modula-2 Compiler"
DESCRIPTION = "This package contains a Modula-2 compiler."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7597"

RPM_NAME = "gcc13-m2-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "d2bdd30fce519c8d76aafd5412dc9ee86978c53a31381f5638362f96f1f3c42a7653be80a49e3f9734a14ec33b3ec2c4d99af4f39b3a2d4170d9d928be71f8ec"

RPROVIDES:${PN} += "gcc13-m2"

RDEPENDS:${PN} += "gcc13 \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm2cor18 \
libm2iso18 \
libm2log18 \
libm2min18 \
libm2pim18 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
