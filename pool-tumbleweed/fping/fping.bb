SUMMARY = "A program to ping multiple hosts"
DESCRIPTION = "FPing is a ping-like program that uses the Internet Control Message \
Protocol (ICMP) echo request to determine if a target host is \
responding. FPing differs from ping in that you can specify any number \
of targets on the command line or specify a file containing a list of \
targets to ping. Instead of sending pings to one target until it times \
out or replies, FPing sends a ping packet and moves on to the next \
target in a round-robin fashion. \
 \
In the default mode, if a target replies, it is noted and removed from \
the list of targets to check. If a target does not respond within a \
certain time limit or retry limit, it is designated as unreachable. \
FPing also supports sending a specified number of pings to a target or \
looping indefinitely (as in ping). \
 \
Unlike ping, FPing is meant to be used in scripts. Its output is \
designed to be easy to parse."
LICENSE = "MIT"

PV = "5.1"

RPM_NAME = "fping-5.1-1.8.aarch64.rpm"
RPM_HASH = "48a3c2205246ae17c2530222fbfe17d3163406c867f66be9d43362e25c1d497a9b79a2b8ed4d477a4e15eebd658fd019a0fc4384c78ab7780a96c8efd130cfc1"

RPROVIDES:${PN} += "fping"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
permissions"

inherit rpm
