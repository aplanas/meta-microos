SUMMARY = "Terminal screen handling and optimization"
DESCRIPTION = "'Curses' is the interface between Perl and your system's curses(3) library. \
For descriptions on the usage of a given function, variable, or constant, \
consult your system's documentation, as such information invariably varies \
(:-) between different curses(3) libraries and operating systems. This \
document describes the interface itself, and assumes that you already know \
how your system's curses(3) library works."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.44"

RPM_NAME = "perl-Curses-1.44-1.2.aarch64.rpm"
RPM_HASH = "f3265c28378f387fad17b918e454f3b5abe4d8ddce7cba6c3ca702818f9fc285570b616903ca2f9025f58fcc5c1b14410a617d4410bdbfd12ddcf8d5ac8c4734"

RPROVIDES:${PN} += "perl-Curses \
perl-Curses--Field \
perl-Curses--Form \
perl-Curses--Item \
perl-Curses--Menu \
perl-Curses--Panel \
perl-Curses--Screen \
perl-Curses--Window"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libform.so.5 \
libmenu.so.5 \
libncursesw.so.5 \
libpanel.so.5 \
libtinfo.so.5 \
perl--MODULE-COMPAT-5.36.0"

inherit rpm
