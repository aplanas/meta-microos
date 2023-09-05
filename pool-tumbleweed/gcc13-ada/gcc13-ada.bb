SUMMARY = "GNU Ada Compiler Based on GCC (GNAT)"
DESCRIPTION = "This package contains an Ada compiler and associated development \
tools based on the GNU GCC technology."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "gcc13-ada-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "aa0d8682d5d921beac0c372f7d2b87d1629302a4eeb4b2ad81577eef457195ba91aeaf8ef547c381690846cf2d2945c6e68be70af50fbcd8361b17a6381d0ab6"

RPROVIDES:${PN} += "gcc13-ada"

RDEPENDS:${PN} += "gcc13 \
ld-linux-aarch64.so.1 \
libada13 \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
