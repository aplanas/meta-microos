SUMMARY = "Tools for Native Language Support (NLS)"
DESCRIPTION = "This package contains the `intl' library as well as tools that ease the \
creation and maintenance of message catalogs. With it you can extract \
strings from source code. The supplied Emacs mode (po-mode.el) will aid \
in editing these catalogs (called PO files, for portable object) and \
add translations. A special compiler will turn these PO files into \
binary catalogs."
LICENSE = "LGPL-2.1-or-later"

PV = "0.21.1"

RPM_NAME = "gettext-tools-0.21.1-2.2.aarch64.rpm"
RPM_HASH = "22e3db7318b1f1063145b1ca89bb51925abae7515e270c01de03d253e22675e861502909cdb3bfd9fc195e334bd88b42cb377501b44476c69e2e143af340e427"

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
