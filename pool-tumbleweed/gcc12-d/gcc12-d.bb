SUMMARY = "GNU D Compiler"
DESCRIPTION = "This package contains a D compiler and associated development \
files based on the GNU GCC technology."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "gcc12-d-12.3.0+git1204-1.33.aarch64.rpm"
RPM_HASH = "e9ae0f3e2094a087e6c1c45fc659d751905cd46341e616370cd535cd6b91871261828e0700835d7c6df51e8cbe0425ec5aa52d91a62b32cfe52062ea34a51095"

RPROVIDES:${PN} += "gcc12-d"

RDEPENDS:${PN} += "gcc12 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdruntime3 \
libgmp.so.10 \
libgphobos3 \
libisl.so.23 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
