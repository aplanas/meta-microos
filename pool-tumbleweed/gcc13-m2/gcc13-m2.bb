SUMMARY = "GNU Modula-2 Compiler"
DESCRIPTION = "This package contains a Modula-2 compiler."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "gcc13-m2-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "a76014e254cf4f4372281525123acfbc8799b7bba6e29ea0e42d3aaaf6b827cba264b787617d728be6f16686044134282663de9cb97c03702de978000be42836"

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
