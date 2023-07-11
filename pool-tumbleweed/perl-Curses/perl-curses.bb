SUMMARY = "Terminal screen handling and optimization"
DESCRIPTION = "'Curses' is the interface between Perl and your system's curses(3) library. \
For descriptions on the usage of a given function, variable, or constant, \
consult your system's documentation, as such information invariably varies \
(:-) between different curses(3) libraries and operating systems. This \
document describes the interface itself, and assumes that you already know \
how your system's curses(3) library works."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.44"

RPM_NAME = "perl-Curses-1.44-1.3.aarch64.rpm"
RPM_HASH = "1e932bce3ac6d4533fb13fd3a19e5344eb3f375719c9520ee1f3b9e780d83714fbef604b421ce17975866471f97a13b45f3bd9ef80ab1b54099fca4f5afc1b72"

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
perl--MODULE-COMPAT-5.36.1"

inherit rpm
