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
gettext-tools(aarch-64) \
libgettextpo.so.0()(64bit) \
libgnuintl.so.8()(64bit)"
RDEPENDS:${PN} += "/bin/sh \
gettext-runtime \
info \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgettextlib-0.21.1.so()(64bit) \
libgettextsrc-0.21.1.so()(64bit) \
libgomp.so.1()(64bit) \
libgomp.so.1(GOMP_1.0)(64bit) \
libgomp.so.1(GOMP_4.0)(64bit) \
libgomp.so.1(GOMP_4.5)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libtextstyle.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
xz"

inherit rpm
