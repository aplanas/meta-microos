SUMMARY = "IPv4/IPv6 Subnet Calculator"
DESCRIPTION = "SubNetCalc is an IPv4/IPv6 subnet address calculator. For a given IPv4 or IPv6 \
address and netmask or prefix length, it calculates network address, broadcast \
address, maximum number of hosts and host address range. It also prints the \
addresses in binary format for better understandability. Furthermore, it \
prints information on specific address types (e.g. type, scope, \
interface ID, etc.)."
LICENSE = "GPL-3.0-or-later"

PV = "2.4.21"

RPM_NAME = "subnetcalc-2.4.21-1.2.aarch64.rpm"
RPM_HASH = "25d4071307242d6ce6df6c8ffac6837e3f8276c9822e5b6c471bf8838270da8ffe36678788925e068c644c2fdc7c4258167e98d154e35e8561cd2502ac80cce4"

RPROVIDES:${PN} += "subnetcalc \
subnetcalc(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
