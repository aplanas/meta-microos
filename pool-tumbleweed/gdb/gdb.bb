SUMMARY = "A GNU source-level debugger for C, C++, Fortran and other languages"
DESCRIPTION = "GDB, the GNU debugger, allows you to debug programs written in C, C++, \
Java, and other languages, by executing them in a controlled fashion \
and printing their data."
LICENSE = "GPL-3.0-only-with-GCC-exception-3.1 & GPL-3.0-or-later & LGPL-2.1-or-later & LGPL-3.0-or-later"

PV = "13.2"

RPM_NAME = "gdb-13.2-1.1.aarch64.rpm"
RPM_HASH = "ad926bbd93e55de0784c4e6e757f70d7f01f89bb316eb94494032b8d5f39eb6b42e239316202996d640473d92ae2db61f05f0dbd1cd211ac279b49f5e922b601"

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
libpython3.11.so.1.0 \
libreadline.so.8 \
libsource-highlight.so.4 \
libstdc++.so.6 \
libtinfo.so.6 \
libz.so.1 \
libzstd.so.1 \
python3-base"

inherit rpm
