SUMMARY = "Development files for libbpf"
DESCRIPTION = "libbpf is a C library which provides API for managing eBPF programs and maps."
LICENSE = "LGPL-2.1-only"

PV = "1.2.0"

RPM_NAME = "libbpf-devel-1.2.0-1.2.aarch64.rpm"
RPM_HASH = "574fb11efcae6fa392fbd2c8b6ee0e60734c0689fd2f7f6cde78cb974699147afe25fc7dd7339591c66e3a5bb76a3ed846b3301cf1bf316069bfc180a260c56f"

RPROVIDES:${PN} += "libbpf-devel \
pkgconfig-libbpf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbpf1 \
pkgconfig-libelf \
pkgconfig-zlib"

inherit rpm
