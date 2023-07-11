SUMMARY = "Linux network configuration utilities"
DESCRIPTION = "iproute2 is a collection of user-space utilities to set up networking \
under Linux from the command-line. It can inspect and configure, \
among other things: interface paramters, IP addresses, routing, \
tunnels, bridges, packet transformations (IPsec, etc.), and Quality \
of Service."
LICENSE = "GPL-2.0-only"

PV = "6.3"

RPM_NAME = "iproute2-6.3-1.2.aarch64.rpm"
RPM_HASH = "823e90e0d1d13cbf077d972eaffa0eab773972ed19cf335fd48caee6ab10c08d3ed9c1634ce6ba3bae99a1d4f952c5043c5b438c02627c236a95fc342942ad07"

RPROVIDES:${PN} += "/sbin/ip \
config-iproute2 \
iproute \
iproute2 \
iproute2-doc \
iproute2-xfrm6-raw"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libbpf.so.1 \
libc.so.6 \
libelf.so.1 \
libm.so.6 \
libmnl.so.0 \
libselinux.so.1 \
libxtables.so.12"

inherit rpm
