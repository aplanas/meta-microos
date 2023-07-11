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

RPM_NAME = "perl-Pango-1.227-1.23.aarch64.rpm"
RPM_HASH = "b611e6512a7b48129e6864396c32deebafdf419b622c3ddcd27582a9a697fdf901a345858b428c4e1ce4d40a02ec95a85e9755dd06c2056a15327bfd6c294dc9"

RPROVIDES:${PN} += "perl-Pango \
perl-Pango--Install--Files"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
perl--MODULE-COMPAT-5.36.1 \
perl-Cairo \
perl-ExtUtils--Depends \
perl-ExtUtils--PkgConfig \
perl-Glib"

inherit rpm
