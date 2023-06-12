SUMMARY = "Display file system space usage using graphs and colors"
DESCRIPTION = "dfc is a simple tool that displays file system space usage using graphs and \
colors."
LICENSE = "BSD-3-Clause"

PV = "3.1.1"

RPM_NAME = "dfc-3.1.1-2.12.aarch64.rpm"
RPM_HASH = "a55ad3ad4ef904604aa9effe5e2faf8c40443337acf155a0c4f69fdec94248acff3afd463ed1f03f61759b23d367cf1675225bb51f8321eb98b65e43a1f41ec7"

RPROVIDES:${PN} += "config(dfc) \
dfc \
dfc(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
