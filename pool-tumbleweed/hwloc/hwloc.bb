SUMMARY = "Portable Hardware Locality"
DESCRIPTION = "The Portable Hardware Locality (hwloc) software package provides \
an abstraction (across OS, versions, architectures, ...) \
of the hierarchical topology of modern architectures, including \
NUMA memory nodes, shared caches, processor sockets, processor cores \
and processing units (logical processors or 'threads'). It also gathers \
various system attributes such as cache and memory information. It primarily \
aims at helping applications with gathering information about modern \
computing hardware so as to exploit it accordingly and efficiently. \
 \
hwloc may display the topology in multiple convenient formats. \
It also offers a powerful programming interface (C API) to gather information \
about the hardware, bind processes, and much more."
LICENSE = "BSD-3-Clause"

PV = "2.9.0"

RPM_NAME = "hwloc-2.9.0-3.1.aarch64.rpm"
RPM_HASH = "a1c16caaefb51631493ab145aa9f0c02a9553135ea8a9f6036c2b581a3a074729d31ed472f5c035ccefc6dab9dd72f39f8c6de1d76cf45d81c4ce003e1623072"

RPROVIDES:${PN} += "hwloc"

RDEPENDS:${PN} += "/usr/bin/sh \
desktop-file-utils \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libhwloc.so.15 \
libhwloc15 \
libm.so.6 \
libtinfo.so.6 \
perl-JSON \
perl-base"

inherit rpm
