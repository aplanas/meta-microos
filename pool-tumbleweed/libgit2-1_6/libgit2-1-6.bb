SUMMARY = "C git library"
DESCRIPTION = "libgit2 is a portable, pure C implementation of the Git core methods \
provided as a re-entrant linkable library with a solid API, allowing \
you to write native speed custom Git applications in any language \
with bindings."
LICENSE = "GPL-2.0-only-WITH-GCC-exception-2.0"

PV = "1.6.4"

RPM_NAME = "libgit2-1_6-1.6.4-1.1.aarch64.rpm"
RPM_HASH = "e3a5bdf266c8b9fb77d5d63875f83d467cd21eaefd004d4bdf7b9f46681aaa0a99edf1f60496421155c0dc5b4ad7b4969ca449c5ceae4e4457b1c4909297eb3f"

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
