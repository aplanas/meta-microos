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
emacs-program"

RDEPENDS:${PN} += "/usr/bin/sh \
emacs \
emacs-eln \
fileutils \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libgccjit.so.0 \
libgmp.so.10 \
libgnutls.so.30 \
libgpm.so.2 \
libjansson.so.4 \
liblcms2.so.2 \
libm.so.6 \
libselinux.so.1 \
libsystemd.so.0 \
libtinfo.so.6 \
libxml2.so.2 \
libz.so.1"

inherit rpm
