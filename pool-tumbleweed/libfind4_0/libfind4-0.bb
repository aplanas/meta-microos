SUMMARY = "A library for /usr/bin/find-like functionality"
DESCRIPTION = "libfind allows to be used for adding find(1)-like command-line features \
to programs."
LICENSE = "CDDL-1.0"

PV = "1.8"

RPM_NAME = "libfind4_0-1.8-47.3.aarch64.rpm"
RPM_HASH = "0ce8a3d1d19c9a0de2e3024a081341ca3e7d115ffd72019ff84b9fe370736d6d1b48690daaf79ad965c67f79ccdddd7cfb49bf5f40f000829f602d3a07c9acc4"

RPROVIDES:${PN} += "libfind.so.4.0()(64bit) \
libfind.so.4.0(SCHILY_0.1)(64bit) \
libfind.so.4.0(SCHILY_0.2)(64bit) \
libfind.so.4.0(SCHILY_0.9)(64bit) \
libfind.so.4.0(SCHILY_0.9.1)(64bit) \
libfind.so.4.0(SCHILY_0.9.2)(64bit) \
libfind.so.4.0(SCHILY_0.9.3)(64bit) \
libfind.so.4.0(SCHILY_0.9.4)(64bit) \
libfind4_0 \
libfind4_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libacl.so.1()(64bit) \
libacl.so.1(ACL_1.0)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libschily.so.2.0()(64bit) \
libschily.so.2.0(SCHILY_1.0)(64bit) \
libschily.so.2.0(SCHILY_1.2)(64bit) \
libschily.so.2.0(SCHILY_1.3)(64bit) \
libschily.so.2.0(SCHILY_1.5)(64bit)"

inherit rpm
