SUMMARY = "GNU Emacs-nox: An Emacs Binary without X Window System Support"
DESCRIPTION = "Eight Megabytes And Constantly Swapping. Call it \
 \
emacs-nox \
 \
Love it or leave it."
LICENSE = "GPL-3.0-or-later"

PV = "29.1"

RPM_NAME = "emacs-nox-29.1-3.1.aarch64.rpm"
RPM_HASH = "5b48465c411cb5702b7e9151fa38b18bd2874b7aa032601b1e30f17b8e941d2dc21a9557aaaa7501c28910657671b28871f7d5082864ec0940b34a087caedf30"

RPROVIDES:${PN} += "emacs-nox \
emacs-program"

RDEPENDS:${PN} += "/usr/bin/sh \
emacs \
emacs-eln \
fileutils \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libgmp.so.10 \
libgnutls.so.30 \
libgpm.so.2 \
libjansson.so.4 \
liblcms2.so.2 \
libm.so.6 \
libselinux.so.1 \
libsqlite3.so.0 \
libsystemd.so.0 \
libtinfo.so.6 \
libtree-sitter.so.0 \
libxml2.so.2 \
libz.so.1"

inherit rpm
