SUMMARY = "A standalone server for GDB (the GNU source-level debugger)"
DESCRIPTION = "GDB, the GNU debugger, allows you to debug programs written in C, C++, \
Java, and other languages, by executing them in a controlled fashion \
and printing their data. \
 \
This package provides a program that allows you to run GDB on a different \
machine than the one which is running the program being debugged."
LICENSE = "GPL-3.0-only-with-GCC-exception-3.1 & GPL-3.0-or-later & LGPL-2.1-or-later & LGPL-3.0-or-later"

PV = "13.2"

RPM_NAME = "gdbserver-13.2-2.1.aarch64.rpm"
RPM_HASH = "e51bdb51964c112ef467675005626c8544ee5ee58ca707cef0967648c570e7cff2cec410d4a5052a687e0f202fcd2a5c458766cb7de29832fd29e6b97079e02b"

RPROVIDES:${PN} += "gdbserver"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
