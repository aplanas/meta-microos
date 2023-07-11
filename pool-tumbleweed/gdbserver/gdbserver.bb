SUMMARY = "A standalone server for GDB (the GNU source-level debugger)"
DESCRIPTION = "GDB, the GNU debugger, allows you to debug programs written in C, C++, \
Java, and other languages, by executing them in a controlled fashion \
and printing their data. \
 \
This package provides a program that allows you to run GDB on a different \
machine than the one which is running the program being debugged."
LICENSE = "GPL-3.0-only-with-GCC-exception-3.1 & GPL-3.0-or-later & LGPL-2.1-or-later & LGPL-3.0-or-later"

PV = "13.2"

RPM_NAME = "gdbserver-13.2-1.1.aarch64.rpm"
RPM_HASH = "ab567297a125432bbd108ad4f81b9fa92ddee3e5a0e8a2231e5f5ad288c8650d94f3e102a6084d71998bcf3db725927fde28b679db1c4448f162c1b845091e61"

RPROVIDES:${PN} += "gdbserver"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
