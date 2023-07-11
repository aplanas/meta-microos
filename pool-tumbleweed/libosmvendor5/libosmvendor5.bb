SUMMARY = "Opensm runtime library"
DESCRIPTION = "This package contains one of the opensm runtime libraries."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "3.3.24"

RPM_NAME = "libosmvendor5-3.3.24-3.8.aarch64.rpm"
RPM_HASH = "7a606bb9b7ca6693eaf5a13ab77d55c85ad32930cb80f321aa3a182fbe13bb5907b0fe4a11a06e97d85da7f9b1c73d3926c89054b0e5ff88dba7a9cc928a8718"

RPROVIDES:${PN} += "libosmvendor.so.5 \
libosmvendor5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibumad.so.3 \
libopensm.so.9 \
libosmcomp.so.5"

inherit rpm
