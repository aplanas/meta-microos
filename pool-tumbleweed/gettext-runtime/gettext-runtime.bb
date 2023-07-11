SUMMARY = "Tools for Native Language Support (NLS)"
DESCRIPTION = "This package contains the intl library as well as tools that ease the \
creation and maintenance of message catalogs. It allows you to extract \
strings from source code. The supplied Emacs mode (po-mode.el) helps \
editing these catalogs (called PO files, for portable object) and \
adding translations. A special compiler turns these PO files into \
binary catalogs."
LICENSE = "GPL-3.0-or-later & LGPL-2.0-or-later"

PV = "0.21.1"

RPM_NAME = "gettext-runtime-0.21.1-2.2.aarch64.rpm"
RPM_HASH = "3c322da68d471dd8135e29205bd7332458827d9984dc1c8a62575aab1a80356c4e64f58f8222e854cb608ee53ef7516a1f3d3a864d75e898e2428c2d8d8b7ac7"

RPROVIDES:${PN} += "gettext \
gettext-runtime \
libasprintf.so.0 \
libgettextlib-0.21.1.so \
libgettextsrc-0.21.1.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6 \
libtextstyle.so.0 \
libxml2.so.2"

inherit rpm
