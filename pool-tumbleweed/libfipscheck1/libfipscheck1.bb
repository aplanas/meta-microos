SUMMARY = "Library files for fipscheck"
DESCRIPTION = "This package contains the FIPSCheck library."
LICENSE = "BSD-2-Clause"

PV = "1.7.0"

RPM_NAME = "libfipscheck1-1.7.0-1.4.aarch64.rpm"
RPM_HASH = "c229bb536c18bbce68b82307fb12cd6e8256f294e9bad16c937e50f78a25c2df66047dea0888e2cc1e002f7c752ecff2380f3c10005d2a1bfc952903012c556c"

RPROVIDES:${PN} += "libfipscheck.so.1()(64bit) \
libfipscheck1 \
libfipscheck1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/fipscheck \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
