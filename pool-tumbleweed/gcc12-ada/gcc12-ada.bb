SUMMARY = "GNU Ada Compiler Based on GCC (GNAT)"
DESCRIPTION = "This package contains an Ada compiler and associated development \
tools based on the GNU GCC technology."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "gcc12-ada-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "c9694e3a4e0fcaf1e73f7f57bc4e41886be9c6a794a9ae70966f410312b88cb83b5a6f2bf821aff8655329312233e7f5e40122ff85b8354a6a4a1cbdc9106a79"

RPROVIDES:${PN} += "gcc12-ada"

RDEPENDS:${PN} += "gcc12 \
libada12 \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
