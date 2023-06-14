SUMMARY = "GNU Go compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Go language."
LICENSE = "BSD-3-Clause"

PV = "13.1.1+git7364"

RPM_NAME = "libgo22-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "82aae806b88d683556941f5986eaaff6e80adf02c3466ceb6792b4391fd80e0c862fe99971bc609c2512906719dad0d851374531016941825e3bae5bdbccc9ec"

RPROVIDES:${PN} += "libgo.so.22 \
libgo22"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
