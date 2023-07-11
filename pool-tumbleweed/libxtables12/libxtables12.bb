SUMMARY = "The iptables plugin interface"
DESCRIPTION = "This library contains all the iptables code shared between iptables, \
ip6tables, their extensions, and for external integration for e.g. \
iproute2's m_xt."
LICENSE = "Artistic-2.0 & GPL-2.0-only"

PV = "1.8.9"

RPM_NAME = "libxtables12-1.8.9-1.4.aarch64.rpm"
RPM_HASH = "e47aad03d86b2c5cca0dfd2d806c71847d69881ad67e225266db1a21e5670190a47ca0bfeafbee5d3cbd827ccd28421f863e68066c190fd625a9716cc57e7da7"

RPROVIDES:${PN} += "libxtables.so.12 \
libxtables12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
