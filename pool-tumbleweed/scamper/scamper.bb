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

PV = "20230302"

RPM_NAME = "scamper-20230302-1.3.aarch64.rpm"
RPM_HASH = "901af4fbd00887b277ce638ce2ef1d05ac577c500855981f7ce900fa25b5a21cc722abe34d08fe50538bc1d7244ecaa070420f3806d46111484b06743fa1853b"

RPROVIDES:${PN} += "scamper \
scamper(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libm.so.6()(64bit) \
libscamperctrl.so.1()(64bit) \
libscamperfile.so.5()(64bit) \
libssl.so.3()(64bit) \
libz.so.1()(64bit)"

inherit rpm
