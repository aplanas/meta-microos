SUMMARY = "A GNU source-level debugger for C, C++, Fortran and other languages"
DESCRIPTION = "GDB, the GNU debugger, allows you to debug programs written in C, C++, \
Java, and other languages, by executing them in a controlled fashion \
and printing their data."
LICENSE = "GPL-3.0-only-with-GCC-exception-3.1 & GPL-3.0-or-later & LGPL-2.1-or-later & LGPL-3.0-or-later"

PV = "12.1"

RPM_NAME = "gdb-12.1-8.1.aarch64.rpm"
RPM_HASH = "74fd1b874d96a1522a0be437cfe9f4700432943e8b90fd08e63671225432e61c301a5b075d6e45919e4ed15572ae4e11b6a3cf1b2745c86d46020cdc03e2de7a"

RPROVIDES:${PN} += "config-gdb \
gdb"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libbabeltrace-ctf.so.1 \
libbabeltrace.so.1 \
libc.so.6 \
libdebuginfod.so.1 \
libexpat.so.1 \
libgcc-s.so.1 \
libgmp.so.10 \
liblzma.so.5 \
libm.so.6 \
libmpfr.so.6 \
libncursesw.so.6 \
libpython3.10.so.1.0 \
libreadline.so.8 \
libsource-highlight.so.4 \
libstdc++.so.6 \
libtinfo.so.6 \
libz.so.1 \
libzstd.so.1 \
python3-base"

inherit rpm
