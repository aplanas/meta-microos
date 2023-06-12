SUMMARY = "Curses debugger"
DESCRIPTION = "CGDB is a curses (terminal-based) interface to the GNU Debugger (GDB). Its goal \
is to be lightweight and responsive; not encumbered with unnecessary features. \
 \
The primary feature of CGDB is the constant presence of a source display, \
updated as the program executes, to help keep you focused while debugging. The \
interface is inspired by the classic Unix text editor, vi. Those familiar with \
vi (or vim) should feel right at home using CGDB."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.0"

RPM_NAME = "cgdb-0.8.0-1.5.aarch64.rpm"
RPM_HASH = "cf29abac1648cfcd7e884a6a1a87b9426235c857793da9fbb0fd3a29c7da3c83fd15febdef2e04e229e59bac7a80ae5da64494876899c68a065201cb8977f57b"

RPROVIDES:${PN} += "cgdb \
cgdb(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
gdb \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libncursesw.so.6()(64bit) \
libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) \
libreadline.so.8()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm