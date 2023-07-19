SUMMARY = "Linux network configuration utilities"
DESCRIPTION = "iproute2 is a collection of user-space utilities to set up networking \
under Linux from the command-line. It can inspect and configure, \
among other things: interface paramters, IP addresses, routing, \
tunnels, bridges, packet transformations (IPsec, etc.), and Quality \
of Service."
LICENSE = "GPL-2.0-only"

PV = "6.4"

RPM_NAME = "iproute2-6.4-1.1.aarch64.rpm"
RPM_HASH = "528463a9ccad11f5d91753be2dde06c1d8f4b771e5ec3c119dfebd0e8cc0522c69869b41844782cd37871538438f72c70e1639457b36bf508a5195095959e546"

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
