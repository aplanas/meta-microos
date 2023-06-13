SUMMARY = "Statistics generator for logs"
DESCRIPTION = "Logtop is a basic log analyzer. \
It allows piping logs into it to obtain statistics."
LICENSE = "BSD-2-Clause"

PV = "0.7"

RPM_NAME = "logtop-0.7-1.16.aarch64.rpm"
RPM_HASH = "2829b61cbeea0a208dd87972e481fe070b89222f96a0ac9f8dd40fe8a800de41a55bc6a0728dab59898fa2e579e59aca1f6e50ece35a781d4503dbaaa0dce393"

RPROVIDES:${PN} += "logtop \
logtop(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libncursesw.so.6()(64bit) \
libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit)"

inherit rpm
