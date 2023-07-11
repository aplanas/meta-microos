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

RPM_NAME = "cgdb-0.8.0-1.6.aarch64.rpm"
RPM_HASH = "5c9b2a57e032c0a52c618a303c084149dd55f66ec1303fdb86998f1106e08b68a376460aef686e2d7eb4861c3188e90fbaa7a282a5d067eca125a7bd06039a2e"

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
