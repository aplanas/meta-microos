SUMMARY = "C git library"
DESCRIPTION = "libgit2 is a portable, pure C implementation of the Git core methods \
provided as a re-entrant linkable library with a solid API, allowing \
you to write native speed custom Git applications in any language \
with bindings."
LICENSE = "GPL-2.0-only-with-GCC-exception-2.0"

PV = "1.7.0"

RPM_NAME = "libgit2-1_7-1.7.0-1.1.aarch64.rpm"
RPM_HASH = "c12be8400ca8b6e45155698271c5593188a7c9c7e596faa511e0bed95a44f077d2335e282aec475d39239cda909929fba9154b1c6ae87a0307c8391b46348b72"

RPROVIDES:${PN} += "libgit2-1-7 \
libgit2.so.1.7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libpcre2-8.so.0 \
libssh2.so.1 \
libssl.so.3 \
libz.so.1"

inherit rpm
