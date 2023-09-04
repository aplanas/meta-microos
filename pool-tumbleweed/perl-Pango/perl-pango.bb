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

RPM_NAME = "perl-Pango-1.227-1.24.aarch64.rpm"
RPM_HASH = "80100a562db6ed8b8b6f310321f605df59ce38004ba46ea062b426c925f86d5b4c70251414051c24866585967404cb1746f9ff90996e031c04c528acfbdc7f77"

RPROVIDES:${PN} += "perl-Pango \
perl-Pango--Install--Files"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
perl--MODULE-COMPAT-5.38.0 \
perl-Cairo \
perl-ExtUtils--Depends \
perl-ExtUtils--PkgConfig \
perl-Glib"

inherit rpm
