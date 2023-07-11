SUMMARY = "GNU Ada Compiler Based on GCC (GNAT)"
DESCRIPTION = "This package contains an Ada compiler and associated development \
tools based on the GNU GCC technology."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "gcc12-ada-12.3.0+git1204-1.33.aarch64.rpm"
RPM_HASH = "dc86e30ef59406199e66b91a2f2a73383a5858b74eb21c4348015a1a52487639f2b9bf0aabff8fc23ad94240b9fa9956a76618d9114419725a2f1c3aac0d2ab7"

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
