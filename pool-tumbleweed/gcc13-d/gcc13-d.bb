SUMMARY = "GNU D Compiler"
DESCRIPTION = "This package contains a D compiler and associated development \
files based on the GNU GCC technology."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "gcc13-d-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "a15239f93001bf1b2faa4a897da2050b8dc0b6cafa4f886b46e56a57bd6c77ddbea92a7f649d975e47bfa0fb8012b8ffd906216de6cf893c11a1dff11ae06841"

RPROVIDES:${PN} += "gcc13-d"

RDEPENDS:${PN} += "gcc13 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdruntime4 \
libgmp.so.10 \
libgphobos4 \
libisl.so.23 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
