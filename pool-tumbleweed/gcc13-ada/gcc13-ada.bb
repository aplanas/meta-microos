SUMMARY = "GNU Ada Compiler Based on GCC (GNAT)"
DESCRIPTION = "This package contains an Ada compiler and associated development \
tools based on the GNU GCC technology."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "gcc13-ada-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "e3bb84768ef8658c03bf3ae32a743aa84f4c3b29ca587bdd3ce8afe1e950068518ccf2abdadf483190d5e88b834c27d22242ca86e5dc54fc0b0ffb762e5c4d6e"

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
