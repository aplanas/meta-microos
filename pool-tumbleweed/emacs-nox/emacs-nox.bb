SUMMARY = "GNU Emacs-nox: An Emacs Binary without X Window System Support"
DESCRIPTION = "Eight Megabytes And Constantly Swapping. Call it \
 \
emacs-nox \
 \
Love it or leave it."
LICENSE = "GPL-3.0-or-later"

PV = "28.2"

RPM_NAME = "emacs-nox-28.2-4.2.aarch64.rpm"
RPM_HASH = "72a00e6b56d73f15a3421185ba039c57dfa5e73b32a879b8009248b97a5818f3694948878d8d754a8aaefd0f82bebbaccfe358225d135b2e57331a0509894f0c"

RPROVIDES:${PN} += "emacs-nox \
emacs-nox(aarch-64) \
emacs_program"

RDEPENDS:${PN} += "/bin/sh \
emacs \
emacs-eln \
fileutils \
ld-linux-aarch64.so.1()(64bit) \
libacl.so.1()(64bit) \
libc.so.6()(64bit) \
libgccjit.so.0()(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_0)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_1)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_11)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_13)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_14)(64bit) \
libgmp.so.10()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libgpm.so.2()(64bit) \
libjansson.so.4()(64bit) \
liblcms2.so.2()(64bit) \
libm.so.6()(64bit) \
libselinux.so.1()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libtinfo.so.6()(64bit) \
libxml2.so.2()(64bit) \
libz.so.1()(64bit)"

inherit rpm
