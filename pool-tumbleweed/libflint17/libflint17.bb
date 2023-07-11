SUMMARY = "C library for doing number theory"
DESCRIPTION = "FLINT (Fast Library for Number Theory) is a C library in support of \
computations in number theory. It is also a research project into \
algorithms in number theory. At this stage, FLINT consists mainly of \
fast integer and polynomial arithmetic and linear algebra."
LICENSE = "LGPL-2.1-or-later"

PV = "2.9.0"

RPM_NAME = "libflint17-2.9.0-2.2.aarch64.rpm"
RPM_HASH = "df6828a8691265fd6bee3599f282839070adde765ce38093dc883432fa413e2711b3fa82efeded6cb87663f006f0c18cf3ff9ebc20139804e78b0050c3e99f46"

RPROVIDES:${PN} += "libflint.so.17 \
libflint17"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libm.so.6 \
libmpfr.so.6 \
libntl.so.44 \
libstdc++.so.6"

inherit rpm
