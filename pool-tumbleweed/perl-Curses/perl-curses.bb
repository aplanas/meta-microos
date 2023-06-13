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

RPROVIDES:${PN} += "perl(Curses) \
perl(Curses::Field) \
perl(Curses::Form) \
perl(Curses::Item) \
perl(Curses::Menu) \
perl(Curses::Panel) \
perl(Curses::Screen) \
perl(Curses::Window) \
perl-Curses \
perl-Curses(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libform.so.5()(64bit) \
libform.so.5(NCURSES_5.0.19991023)(64bit) \
libmenu.so.5()(64bit) \
libmenu.so.5(NCURSES_5.0.19991023)(64bit) \
libncursesw.so.5()(64bit) \
libncursesw.so.5(NCURSESW_5.1.20000708)(64bit) \
libncursesw.so.5(NCURSESW_5.3.20021019)(64bit) \
libpanel.so.5()(64bit) \
libpanel.so.5(NCURSES_5.0.19991023)(64bit) \
libtinfo.so.5()(64bit) \
libtinfo.so.5(NCURSES_TINFO_5.0.19991023)(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
