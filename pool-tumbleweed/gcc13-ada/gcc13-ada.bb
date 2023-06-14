SUMMARY = "GNU Ada Compiler Based on GCC (GNAT)"
DESCRIPTION = "This package contains an Ada compiler and associated development \
tools based on the GNU GCC technology."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "gcc13-ada-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "657f41dbe5429ed2b0dff593cecb4644fff9df7440d7c4c64b5c156c69bde857a95634d4d52e9bb88c755e35b4427f01d8ffe2a8c9e84573cdf87398c0d3e711"

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
