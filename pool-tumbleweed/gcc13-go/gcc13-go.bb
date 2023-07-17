SUMMARY = "GNU Go Compiler"
DESCRIPTION = "This package contains a Go compiler and associated development \
files based on the GNU GCC technology."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7552"

RPM_NAME = "gcc13-go-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "ef180572d0ffca7dd39c2d7d887b5b9e0cd144cf7298c13ae84f71bd13fac7fc43a438f10522aa6d11a65029c0d0c99e0148aa8b678e99e639aed737035b61bd"

RPROVIDES:${PN} += "gcc13-go"

RDEPENDS:${PN} += "gcc13 \
libc.so.6 \
libgmp.so.10 \
libgo.so.22 \
libgo22 \
libisl.so.23 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
