SUMMARY = "Tool to send copies of (UDP) datagrams to multiple receivers"
DESCRIPTION = "This program receives UDP datagrams on a given port, and resends \
those datagrams to a specified set of receivers. \
In addition, a sampling divisor N may be specified individually for each \
receiver, which will then only receive one in N of the received packets. \
Optional spoofing is also supported."
LICENSE = "GPL-2.0-only"

PV = "1.3.8rc1+git.20171112"

RPM_NAME = "samplicator-1.3.8rc1+git.20171112-3.7.aarch64.rpm"
RPM_HASH = "28360939d267074493ffdb995a75b71e6c8b449ae2d784e63c30056601d70bba445b349cdd4b74a097a2923a297d96f96026c588063520c22e86d39465cd88dc"

RPROVIDES:${PN} += "config(samplicator) \
samplicator \
samplicator(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
