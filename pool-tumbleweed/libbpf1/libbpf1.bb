SUMMARY = "C library for managing eBPF programs and maps"
DESCRIPTION = "libbpf is a C library which provides API for managing eBPF programs and maps."
LICENSE = "LGPL-2.1-only"

PV = "1.2.2"

RPM_NAME = "libbpf1-1.2.2-1.1.aarch64.rpm"
RPM_HASH = "4a2a91d040b8657a88607ad8b8d8e516676f1750b47ab1ce88879f77d486d7d155d043b2822f1ea78991fc5c64a3e99b985226df9bbf188928a5a46467f630d0"

RPROVIDES:${PN} += "libbpf.so.1 \
libbpf1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libelf.so.1 \
libz.so.1"

inherit rpm
