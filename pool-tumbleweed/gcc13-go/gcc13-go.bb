SUMMARY = "GNU Go Compiler"
DESCRIPTION = "This package contains a Go compiler and associated development \
files based on the GNU GCC technology."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "gcc13-go-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "40b3e5f0dcc69c577d0c53dbd1f792863bb2b3f6d8a63ac72c9337d5d0c842abe0b08fb4a752ec354f970ba8153cf6aba3bd76e7b8b1e2aef79569108c6cd8e9"

RPROVIDES:${PN} += "gcc13-go \
gcc13-go(aarch-64)"

RDEPENDS:${PN} += "gcc13 \
libc.so.6(GLIBC_2.36)(64bit) \
libgmp.so.10()(64bit) \
libgo.so.22()(64bit) \
libgo22 \
libisl.so.23()(64bit) \
libmpc.so.3()(64bit) \
libmpfr.so.6()(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
