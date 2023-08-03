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

PV = "2.9.2"

RPM_NAME = "hwloc-2.9.2-1.1.aarch64.rpm"
RPM_HASH = "df342a3659eceeb2666aa60d85b3839a00fa62d1d7dac54da0096afc249fd022fb87a6d910da2ae6f93b9ec11fffef6e4b148a31896a1772cc2adb6d1eeed287"

RPROVIDES:${PN} += "hwloc"

RDEPENDS:${PN} += "/usr/bin/sh \
desktop-file-utils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhwloc.so.15 \
libhwloc15 \
libm.so.6 \
libtinfo.so.6 \
perl-JSON \
perl-base"

inherit rpm
