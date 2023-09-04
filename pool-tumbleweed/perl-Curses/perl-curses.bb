SUMMARY = "Terminal screen handling and optimization"
DESCRIPTION = "'Curses' is the interface between Perl and your system's curses(3) library. \
For descriptions on the usage of a given function, variable, or constant, \
consult your system's documentation, as such information invariably varies \
(:-) between different curses(3) libraries and operating systems. This \
document describes the interface itself, and assumes that you already know \
how your system's curses(3) library works."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.44"

RPM_NAME = "perl-Curses-1.44-1.4.aarch64.rpm"
RPM_HASH = "16bd96559270ce986e125f564fa6ffc6b19784240e6835304773814db5a0bc7c3b4bc4d13c629a0b59825e8698f0175a87f667dd70c9803d7e86bad5cc2fed8c"

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
perl--MODULE-COMPAT-5.38.0"

inherit rpm
