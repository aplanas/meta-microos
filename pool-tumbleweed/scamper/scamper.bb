SUMMARY = "Parallel Internet measurement utility"
DESCRIPTION = "Scamper is a program that is able to conduct Internet measurement \
tasks to large numbers of IPv4 and IPv6 addresses, in parallel, to \
fill a specified packets-per-second rate. Currently, it supports the \
well-known ping and traceroute techniques, as well as MDA traceroute, \
alias resolution, some parts of tbit, sting, and neighbour discovery. \
 \
Scamper can do ICMP-based Path MTU discovery. scamper starts with the \
outgoing interface's MTU and discovers the location of Path MTU \
bottlenecks. scamper performs a PMTUD search when an ICMP \
fragmentation required message is not returned to establish the PMTU \
to the next point in the network, followed by a TTL limited search to \
infer where the failure appears to occur."
LICENSE = "GPL-2.0-only"

PV = "20230614b"

RPM_NAME = "scamper-20230614b-1.1.aarch64.rpm"
RPM_HASH = "8b479f9617c76289cef579027afc58b4efb21b97439125c769dd9ddc8d4ed60f11016f7b3a5857b594698b506e4459fa6500b8938eab8c73e95f26450b84c810"

RPROVIDES:${PN} += "scamper"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
libscamperctrl.so.2 \
libscamperfile.so.6 \
libssl.so.3 \
libz.so.1"

inherit rpm
