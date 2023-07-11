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

PV = "2.9.1"

RPM_NAME = "hwloc-2.9.1-1.1.aarch64.rpm"
RPM_HASH = "6b8467fe5496048ea47abb38dd303f0ba86282f311a7b35ca96432e69873faf02b7f57370c9f344e7f26abf633adabe860bd8bc880e3233493ac04e8be26af2d"

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
