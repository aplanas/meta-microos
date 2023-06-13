SUMMARY = "A GNU source-level debugger for C, C++, Fortran and other languages"
DESCRIPTION = "GDB, the GNU debugger, allows you to debug programs written in C, C++, \
Java, and other languages, by executing them in a controlled fashion \
and printing their data."
LICENSE = "GPL-3.0-only-WITH-GCC-exception-3.1 & GPL-3.0-or-later & LGPL-2.1-or-later & LGPL-3.0-or-later"

PV = "12.1"

RPM_NAME = "gdb-12.1-8.1.aarch64.rpm"
RPM_HASH = "74fd1b874d96a1522a0be437cfe9f4700432943e8b90fd08e63671225432e61c301a5b075d6e45919e4ed15572ae4e11b6a3cf1b2745c86d46020cdc03e2de7a"

RPROVIDES:${PN} += "config(gdb) \
gdb \
gdb(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libbabeltrace-ctf.so.1()(64bit) \
libbabeltrace.so.1()(64bit) \
libc.so.6()(64bit) \
libdebuginfod.so.1()(64bit) \
libexpat.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgmp.so.10()(64bit) \
liblzma.so.5()(64bit) \
libm.so.6()(64bit) \
libmpfr.so.6()(64bit) \
libncursesw.so.6()(64bit) \
libpython3.10.so.1.0()(64bit) \
libreadline.so.8()(64bit) \
libsource-highlight.so.4()(64bit) \
libstdc++.so.6()(64bit) \
libtinfo.so.6()(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit) \
python3-base"

inherit rpm
