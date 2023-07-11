SUMMARY = "A Symbolic Manipulation System"
DESCRIPTION = "FORM is a Symbolic Manipulation System. It reads symbolic expressions from files \
and executes symbolic/algebraic transformations upon them. The answers are \
returned in a textual mathematical representation. As its landmark feature, the \
size of the considered expressions in FORM is only limited by the available \
disk space and not by the available RAM."
LICENSE = "GPL-3.0-or-later"

PV = "4.3.0"

RPM_NAME = "form-4.3.0-1.5.aarch64.rpm"
RPM_HASH = "fd884b2829f09e2f42cc9714af510aee15696bfc3292cff8d6a7778ed6ed8d7d85bd2a3e300598c6c5b9fa8d7cb86593f9d2f1f1a976e1db2efed6dcf75d3405"

RPROVIDES:${PN} += "form"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libm.so.6 \
libmpi.so.40 \
libstdc++.so.6 \
libz.so.1 \
openmpi4-libs"

inherit rpm
