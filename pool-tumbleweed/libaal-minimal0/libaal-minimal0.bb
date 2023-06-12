SUMMARY = "Application abstraction mechanism library used by reiser4progs"
DESCRIPTION = "libaal includes device abstraction, libc independence code, and more."
LICENSE = "GPL-2.0-only"

PV = "1.0.7"

RPM_NAME = "libaal-minimal0-1.0.7-2.13.aarch64.rpm"
RPM_HASH = "673a333be8dbe91b05c80a050339d8c312b82b8214bb45681e71159053d52596a1f15b4f557abe975abcb526a785ffc26f90a604e4478ea41554da54dba6c232"

RPROVIDES:${PN} += "libaal-minimal.so.0()(64bit) \
libaal-minimal0 \
libaal-minimal0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
