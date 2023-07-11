SUMMARY = "Testing tool for kernel networking stack"
DESCRIPTION = "The packetdrill scripting tool enables quick, precise tests for entire \
TCP/UDP/IPv4/IPv6 network stacks, from the system call layer down to the \
NIC hardware. packetdrill currently works on Linux, FreeBSD, OpenBSD, and \
NetBSD. It can test network stack behavior over physical NICs on a LAN, or \
on a single machine using a tun virtual network device."
LICENSE = "GPL-2.0-only"

PV = "2.0+git.20230521"

RPM_NAME = "packetdrill-2.0+git.20230521-1.1.aarch64.rpm"
RPM_HASH = "968e7847cf4097d83a429274d0eef9cd54e74f8c2cdcfad41935d98735271e6ee6b150ee9cf5bb711c3cca0f45e76d2ea0c2944cc864f1dca22e7892c06a5b67"

RPROVIDES:${PN} += "packetdrill"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
