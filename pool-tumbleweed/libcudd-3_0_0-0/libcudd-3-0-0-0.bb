SUMMARY = "Binary Decision Diagram manipulation library"
DESCRIPTION = "CUDD is a package for the manipulation of Binary Decision Diagrams \
(BDDs), Algebraic Decision Diagrams (ADDs) and Zero-suppressed Binary \
Decision Diagrams (ZDDs)."
LICENSE = "BSD-3-Clause"

PV = "3.0.0"

RPM_NAME = "libcudd-3_0_0-0-3.0.0-3.15.aarch64.rpm"
RPM_HASH = "5f458757abb2680b3e2f070f56dc5455cf1265236855810b82d11d7a6ad1b4ad4a128f63fa719682bbd3ea02b4f3148864c0835910b76ba3106938860ec8dd93"

RPROVIDES:${PN} += "libcudd-3-0-0-0 \
libcudd-3.0.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
