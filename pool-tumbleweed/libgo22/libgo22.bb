SUMMARY = "GNU Go compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Go language."
LICENSE = "BSD-3-Clause"

PV = "13.1.1+git7552"

RPM_NAME = "libgo22-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "8b34f8fefa108cd3dfb0ecd90cb40ee70990dc797816470318dae87d24e06365c05d8cffbe3f2fb793d4bf71640f7143aa7722ac90580964553752e786a87e49"

RPROVIDES:${PN} += "libgo.so.22 \
libgo22"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
