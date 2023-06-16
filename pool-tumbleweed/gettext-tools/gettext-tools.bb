SUMMARY = "Tools for Native Language Support (NLS)"
DESCRIPTION = "This package contains the `intl' library as well as tools that ease the \
creation and maintenance of message catalogs. With it you can extract \
strings from source code. The supplied Emacs mode (po-mode.el) will aid \
in editing these catalogs (called PO files, for portable object) and \
add translations. A special compiler will turn these PO files into \
binary catalogs."
LICENSE = "LGPL-2.1-or-later"

PV = "0.21.1"

RPM_NAME = "gettext-tools-0.21.1-2.1.aarch64.rpm"
RPM_HASH = "57ebb0039957ac9805994840d2f4dc80aa45cfbd50b1d37ac5f4a074b95cf30fe2b1979cec4f400c9510b425856989607d138b2d34e7d4f327965cfd51297243"

RPROVIDES:${PN} += "gettext-devel \
gettext-tools \
libgettextpo.so.0 \
libgnuintl.so.8"

RDEPENDS:${PN} += "/usr/bin/sh \
gettext-runtime \
info \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgettextlib-0.21.1.so \
libgettextsrc-0.21.1.so \
libgomp.so.1 \
libm.so.6 \
libtextstyle.so.0 \
libxml2.so.2 \
xz"

inherit rpm
