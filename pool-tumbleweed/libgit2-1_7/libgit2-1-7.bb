SUMMARY = "C git library"
DESCRIPTION = "libgit2 is a portable, pure C implementation of the Git core methods \
provided as a re-entrant linkable library with a solid API, allowing \
you to write native speed custom Git applications in any language \
with bindings."
LICENSE = "GPL-2.0-only-with-GCC-exception-2.0"

PV = "1.7.1"

RPM_NAME = "libgit2-1_7-1.7.1-1.1.aarch64.rpm"
RPM_HASH = "9e89b08cadf1d84cff46e1ddeca1c8aa5616e215004c4c8b31f0f387f8a1d567c0666cde792b86ff1e17cf84ec8cfce277366a8a826f7cf53f9b2201c5e8a674"

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
