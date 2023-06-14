SUMMARY = "C library for managing eBPF programs and maps"
DESCRIPTION = "libbpf is a C library which provides API for managing eBPF programs and maps."
LICENSE = "LGPL-2.1-only"

PV = "1.2.0"

RPM_NAME = "libbpf1-1.2.0-1.1.aarch64.rpm"
RPM_HASH = "9616b11dbb68df7a2b972c6cf1e13f148e7a9c07e804e9c4e49e98c5061f74812400e1f7c7ee3b62a1f3fe9a18617910183c8e4ac93ab3297e445185bc6d2330"

RPROVIDES:${PN} += "libbpf.so.1 \
libbpf1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libelf.so.1 \
libz.so.1"

inherit rpm
