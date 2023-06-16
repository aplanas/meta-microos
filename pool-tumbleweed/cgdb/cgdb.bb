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

RPROVIDES:${PN} += "cgdb"

RDEPENDS:${PN} += "/usr/bin/sh \
gdb \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libncursesw.so.6 \
libreadline.so.8 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
