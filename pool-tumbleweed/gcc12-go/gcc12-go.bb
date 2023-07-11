SUMMARY = "GNU Go Compiler"
DESCRIPTION = "This package contains a Go compiler and associated development \
files based on the GNU GCC technology."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "gcc12-go-12.3.0+git1204-1.33.aarch64.rpm"
RPM_HASH = "c57a3cae45e3d3f638a16fb916fa39ef3f1dd9c55e52bedcf0e2055b5586a96ad928669a0029c55418b53bd532f2751bb48e1ef7d8d61f0a9d81c2f1b5ec7bb9"

RPROVIDES:${PN} += "gcc12-go"

RDEPENDS:${PN} += "gcc12 \
libc.so.6 \
libgmp.so.10 \
libgo.so.21 \
libgo21 \
libisl.so.23 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
