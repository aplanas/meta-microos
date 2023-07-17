SUMMARY = "GNU Modula-2 Compiler"
DESCRIPTION = "This package contains a Modula-2 compiler."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7552"

RPM_NAME = "gcc13-m2-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "5c7adfec177747518fa244722632a95ecadcb105f34ed71345c09730156e32108c52b0866863949e49df20d251c41d94552887121a3cc90f7dbba57ab1e319e2"

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
