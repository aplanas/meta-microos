SUMMARY = "GNU D Compiler"
DESCRIPTION = "This package contains a D compiler and associated development \
files based on the GNU GCC technology."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "gcc13-d-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "2dba6502792056035670c5816064628de7610f4c646a5c98cfa2752803236e52997de2cff80dd02a83e97ec6ed9af6a9fe17f4603ba4c5d5c6311145b06f6eb1"

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
