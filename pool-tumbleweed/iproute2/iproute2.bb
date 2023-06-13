SUMMARY = "Linux network configuration utilities"
DESCRIPTION = "iproute2 is a collection of user-space utilities to set up networking \
under Linux from the command-line. It can inspect and configure, \
among other things: interface paramters, IP addresses, routing, \
tunnels, bridges, packet transformations (IPsec, etc.), and Quality \
of Service."
LICENSE = "GPL-2.0-only"

PV = "6.3"

RPM_NAME = "iproute2-6.3-1.1.aarch64.rpm"
RPM_HASH = "a89e34983143e9a2f104e3730a9018e102a5066713be1cacd97a88597e325b01414628752feb2bb237d317be6b0c3b577f21ff3d3d4834963146b1c5e8bd22c8"

RPROVIDES:${PN} += "/sbin/ip \
config(iproute2) \
iproute \
iproute2 \
iproute2(aarch-64) \
iproute2(xfrm6_raw) \
iproute2-doc"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbpf.so.1()(64bit) \
libbpf.so.1(LIBBPF_0.0.1)(64bit) \
libbpf.so.1(LIBBPF_0.0.6)(64bit) \
libbpf.so.1(LIBBPF_0.0.7)(64bit) \
libbpf.so.1(LIBBPF_0.1.0)(64bit) \
libbpf.so.1(LIBBPF_0.2.0)(64bit) \
libbpf.so.1(LIBBPF_0.6.0)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libelf.so.1()(64bit) \
libelf.so.1(ELFUTILS_1.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmnl.so.0()(64bit) \
libmnl.so.0(LIBMNL_1.0)(64bit) \
libmnl.so.0(LIBMNL_1.1)(64bit) \
libselinux.so.1()(64bit) \
libselinux.so.1(LIBSELINUX_1.0)(64bit) \
libxtables.so.12()(64bit)"

inherit rpm
