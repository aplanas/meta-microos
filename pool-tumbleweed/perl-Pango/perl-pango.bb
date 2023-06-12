SUMMARY = "Layout and render international text"
DESCRIPTION = "Pango is a library for laying out and rendering text, with an emphasis on \
internationalization. Pango can be used anywhere that text layout is \
needed, but using Pango in conjunction with L<Cairo> and/or L<Gtk2> \
provides a complete solution with high quality text handling and graphics \
rendering. \
 \
Dynamically loaded modules handle text layout for particular \
combinations of script and font backend. Pango provides a wide selection \
of modules, including modules for Hebrew, Arabic, Hangul, Thai, and a \
number of Indic scripts. Virtually all of the world's major scripts are \
supported. \
 \
In addition to the low level layout rendering routines, Pango includes \
Pango::Layout, a high level driver for laying out entire blocks of text, \
and routines to assist in editing internationalized text."
LICENSE = "LGPL-2.1-or-later"

PV = "1.227"

RPM_NAME = "perl-Pango-1.227-1.22.aarch64.rpm"
RPM_HASH = "ee0a9b7b5bfd61273e1d7066aafcf89eb71882886653fbe7315af65d436e78f98a099d99e192725f21d5fe9f82a6d6c33e32c51b924b2ab6c907c34a94598c7b"

RPROVIDES:${PN} += "perl(Pango) \
perl(Pango::Install::Files) \
perl-Pango \
perl-Pango(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
perl(:MODULE_COMPAT_5.36.0) \
perl(Cairo) \
perl(ExtUtils::Depends) \
perl(ExtUtils::PkgConfig) \
perl(Glib)"

inherit rpm
