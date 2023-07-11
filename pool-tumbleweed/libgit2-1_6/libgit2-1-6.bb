SUMMARY = "C git library"
DESCRIPTION = "libgit2 is a portable, pure C implementation of the Git core methods \
provided as a re-entrant linkable library with a solid API, allowing \
you to write native speed custom Git applications in any language \
with bindings."
LICENSE = "GPL-2.0-only-with-GCC-exception-2.0"

PV = "1.6.4"

RPM_NAME = "libgit2-1_6-1.6.4-1.2.aarch64.rpm"
RPM_HASH = "88026c6707f23b67b98ab95a1dfa02103daa176ba7d0656bdd9db158da202ea05d0948650d3a5b3ab4bd08d5d699bdb19829b8f37c7382d53419e64d045dbebc"

RPROVIDES:${PN} += "libgit2-1-6 \
libgit2.so.1.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libpcre2-8.so.0 \
libssh2.so.1 \
libssl.so.3 \
libz.so.1"

inherit rpm
