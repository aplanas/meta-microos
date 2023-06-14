SUMMARY = "Tools for Native Language Support (NLS)"
DESCRIPTION = "This package contains the intl library as well as tools that ease the \
creation and maintenance of message catalogs. It allows you to extract \
strings from source code. The supplied Emacs mode (po-mode.el) helps \
editing these catalogs (called PO files, for portable object) and \
adding translations. A special compiler turns these PO files into \
binary catalogs."
LICENSE = "GPL-3.0-or-later & LGPL-2.0-or-later"

PV = "0.21.1"

RPM_NAME = "gettext-runtime-0.21.1-2.1.aarch64.rpm"
RPM_HASH = "a4e4cb27584dfe51a365aa14106a4f58eae95470f684c9078bd21f9aa2b0854ab03492c75778022fb3cec2e3d0c93ab8a9f67c81f177394795cb0ade8ca4c489"

RPROVIDES:${PN} += "gettext \
gettext-runtime \
libasprintf.so.0 \
libgettextlib-0.21.1.so \
libgettextsrc-0.21.1.so"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6 \
libtextstyle.so.0 \
libxml2.so.2"

inherit rpm
