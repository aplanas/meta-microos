SUMMARY = "The iptables plugin interface"
DESCRIPTION = "This library contains all the iptables code shared between iptables, \
ip6tables, their extensions, and for external integration for e.g. \
iproute2's m_xt."
LICENSE = "Artistic-2.0 & GPL-2.0-only"

PV = "1.8.9"

RPM_NAME = "libxtables12-1.8.9-1.3.aarch64.rpm"
RPM_HASH = "4618b991190f476337ae63d675561b7bf376b53e656c981ff9da1a6153c1086d80bf9a5cad6faff0ec6a9202b965be404c3658459c63af01796b587e6a44fd4f"

RPROVIDES:${PN} += "libxtables.so.12()(64bit) \
libxtables12 \
libxtables12(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
