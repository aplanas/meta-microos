SUMMARY = "C library for managing eBPF programs and maps"
DESCRIPTION = "libbpf is a C library which provides API for managing eBPF programs and maps."
LICENSE = "LGPL-2.1-only"

PV = "1.2.0"

RPM_NAME = "libbpf1-1.2.0-1.1.aarch64.rpm"
RPM_HASH = "9616b11dbb68df7a2b972c6cf1e13f148e7a9c07e804e9c4e49e98c5061f74812400e1f7c7ee3b62a1f3fe9a18617910183c8e4ac93ab3297e445185bc6d2330"

RPROVIDES:${PN} += "libbpf.so.1()(64bit) \
libbpf.so.1(LIBBPF_0.0.1)(64bit) \
libbpf.so.1(LIBBPF_0.0.2)(64bit) \
libbpf.so.1(LIBBPF_0.0.3)(64bit) \
libbpf.so.1(LIBBPF_0.0.4)(64bit) \
libbpf.so.1(LIBBPF_0.0.5)(64bit) \
libbpf.so.1(LIBBPF_0.0.6)(64bit) \
libbpf.so.1(LIBBPF_0.0.7)(64bit) \
libbpf.so.1(LIBBPF_0.0.8)(64bit) \
libbpf.so.1(LIBBPF_0.0.9)(64bit) \
libbpf.so.1(LIBBPF_0.1.0)(64bit) \
libbpf.so.1(LIBBPF_0.2.0)(64bit) \
libbpf.so.1(LIBBPF_0.3.0)(64bit) \
libbpf.so.1(LIBBPF_0.4.0)(64bit) \
libbpf.so.1(LIBBPF_0.5.0)(64bit) \
libbpf.so.1(LIBBPF_0.6.0)(64bit) \
libbpf.so.1(LIBBPF_0.7.0)(64bit) \
libbpf.so.1(LIBBPF_0.8.0)(64bit) \
libbpf.so.1(LIBBPF_1.0.0)(64bit) \
libbpf.so.1(LIBBPF_1.1.0)(64bit) \
libbpf.so.1(LIBBPF_1.2.0)(64bit) \
libbpf1 \
libbpf1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.28)(64bit) \
libelf.so.1()(64bit) \
libelf.so.1(ELFUTILS_1.0)(64bit) \
libelf.so.1(ELFUTILS_1.3)(64bit) \
libelf.so.1(ELFUTILS_1.5)(64bit) \
libelf.so.1(ELFUTILS_1.6)(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.3.3)(64bit)"

inherit rpm
