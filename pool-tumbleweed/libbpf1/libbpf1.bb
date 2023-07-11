SUMMARY = "C library for managing eBPF programs and maps"
DESCRIPTION = "libbpf is a C library which provides API for managing eBPF programs and maps."
LICENSE = "LGPL-2.1-only"

PV = "1.2.0"

RPM_NAME = "libbpf1-1.2.0-1.2.aarch64.rpm"
RPM_HASH = "ce4807aa54d8a5e5fbd5456b936045856555f3e2c2cfbb7218a4716b29bcc8c970a05e64ff67bc8125bc8a934924dd0d3207581b9e905875737d5ac9ec7df44e"

RPROVIDES:${PN} += "libbpf.so.1 \
libbpf1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libelf.so.1 \
libz.so.1"

inherit rpm
