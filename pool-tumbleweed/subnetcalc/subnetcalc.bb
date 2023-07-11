SUMMARY = "IPv4/IPv6 Subnet Calculator"
DESCRIPTION = "SubNetCalc is an IPv4/IPv6 subnet address calculator. For a given IPv4 or IPv6 \
address and netmask or prefix length, it calculates network address, broadcast \
address, maximum number of hosts and host address range. It also prints the \
addresses in binary format for better understandability. Furthermore, it \
prints information on specific address types (e.g. type, scope, \
interface ID, etc.)."
LICENSE = "GPL-3.0-or-later"

PV = "2.4.21"

RPM_NAME = "subnetcalc-2.4.21-1.3.aarch64.rpm"
RPM_HASH = "3bdb80ad60f6f8f60e6835ad12e41b4f2b3a78e76972fcf0e0e4c4ecc36f94ac8fa6f7471eeb5ee13f6bbe31302ab2290ee622cf46575342f57c8dae6bab2dc8"

RPROVIDES:${PN} += "subnetcalc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
