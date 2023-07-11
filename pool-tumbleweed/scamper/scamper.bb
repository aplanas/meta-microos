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

RPM_NAME = "scamper-20230302-1.4.aarch64.rpm"
RPM_HASH = "29a53d7915bf862457b2e12def9114f9d423e7b0b89466a02b9cceab2ae6a168a4c47421e061dcf1e4462eaba869446a835f69ab86351729f88227690a0fe361"

RPROVIDES:${PN} += "scamper"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
libscamperctrl.so.1 \
libscamperfile.so.5 \
libssl.so.3 \
libz.so.1"

inherit rpm
