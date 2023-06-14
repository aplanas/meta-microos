SUMMARY = "Development files for libbpf"
DESCRIPTION = "libbpf is a C library which provides API for managing eBPF programs and maps."
LICENSE = "LGPL-2.1-only"

PV = "1.2.0"

RPM_NAME = "libbpf-devel-1.2.0-1.1.aarch64.rpm"
RPM_HASH = "07976346ecf81f38ad7874159c2b616327bb69b372a34c3b9e4c120070b6bedbc0b8ddeed95f35f6e8dfbffde7dd318c64b28200e2bf49d4a401be1389d24ac2"

RPROVIDES:${PN} += "libbpf-devel \
pkgconfig-libbpf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbpf1 \
pkgconfig-libelf \
pkgconfig-zlib"

inherit rpm
