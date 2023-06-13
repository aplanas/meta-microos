SUMMARY = "A standalone server for GDB (the GNU source-level debugger)"
DESCRIPTION = "GDB, the GNU debugger, allows you to debug programs written in C, C++, \
Java, and other languages, by executing them in a controlled fashion \
and printing their data. \
 \
This package provides a program that allows you to run GDB on a different \
machine than the one which is running the program being debugged."
LICENSE = "GPL-3.0-only-WITH-GCC-exception-3.1 & GPL-3.0-or-later & LGPL-2.1-or-later & LGPL-3.0-or-later"

PV = "12.1"

RPM_NAME = "gdbserver-12.1-8.1.aarch64.rpm"
RPM_HASH = "3c285ee3cfa3982106fb093556d9d53efba8ccc1b0eaa03e5311bb6bc9e309986a78fa1cc3ee8581670069feafb8b2a972a9d7d897a08e1e14003b8ded31be42"

RPROVIDES:${PN} += "gdbserver \
gdbserver(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
