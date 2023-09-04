SUMMARY = "IPv4/IPv6 Subnet Calculator"
DESCRIPTION = "SubNetCalc is an IPv4/IPv6 subnet address calculator. For a given IPv4 or IPv6 \
address and netmask or prefix length, it calculates network address, broadcast \
address, maximum number of hosts and host address range. It also prints the \
addresses in binary format for better understandability. Furthermore, it \
prints information on specific address types (e.g. type, scope, \
interface ID, etc.)."
LICENSE = "GPL-3.0-or-later"

PV = "2.4.22"

RPM_NAME = "subnetcalc-2.4.22-1.1.aarch64.rpm"
RPM_HASH = "e975e8d0e3f822e83334464f3ea90ed96e8af4de4834d7261b9852a25cfaf6aa174f49fa703ee97e7bd3c8424482a2f3e5f72d9188f0f95f106d4864c4478492"

RPROVIDES:${PN} += "subnetcalc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
