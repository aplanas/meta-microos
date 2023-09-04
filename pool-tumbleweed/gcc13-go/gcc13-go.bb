SUMMARY = "GNU Go Compiler"
DESCRIPTION = "This package contains a Go compiler and associated development \
files based on the GNU GCC technology."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "gcc13-go-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "d39a6668d74e2fd1005975a2a24195f02aad44f8bf15bdd828d605d043b7f36bba8156da504299edf4ead7a4759bb476fae0455bd5980fcccb02cd0774098b84"

RPROVIDES:${PN} += "gcc13-go"

RDEPENDS:${PN} += "gcc13 \
ld-linux-aarch64.so.1 \
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
