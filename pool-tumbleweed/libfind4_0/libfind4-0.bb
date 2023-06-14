SUMMARY = "A library for /usr/bin/find-like functionality"
DESCRIPTION = "libfind allows to be used for adding find(1)-like command-line features \
to programs."
LICENSE = "CDDL-1.0"

PV = "1.8"

RPM_NAME = "libfind4_0-1.8-47.3.aarch64.rpm"
RPM_HASH = "0ce8a3d1d19c9a0de2e3024a081341ca3e7d115ffd72019ff84b9fe370736d6d1b48690daaf79ad965c67f79ccdddd7cfb49bf5f40f000829f602d3a07c9acc4"

RPROVIDES:${PN} += "libfind.so.4.0 \
libfind4-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libschily.so.2.0"

inherit rpm
