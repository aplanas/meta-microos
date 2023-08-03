SUMMARY = "GNU Go Compiler"
DESCRIPTION = "This package contains a Go compiler and associated development \
files based on the GNU GCC technology."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7597"

RPM_NAME = "gcc13-go-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "f29b6b77cab7398c3b1de89f25bc82484b512b8b11c8c8bc69764cc0ac79018bdae66463ea47a11ecb34f16f7c224bb0b317c4f2a7587115dc4c0e102beb9c51"

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
