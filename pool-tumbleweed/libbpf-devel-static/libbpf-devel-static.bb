SUMMARY = "Static library for libbpf"
DESCRIPTION = "libbpf is a C library which provides API for managing eBPF programs and maps."
LICENSE = "LGPL-2.1-only"

PV = "1.2.0"

RPM_NAME = "libbpf-devel-static-1.2.0-1.1.aarch64.rpm"
RPM_HASH = "9221c08edb780f49257ff2e73f9c96571f27f7c4cdfcf12acc7d3fc8ecfaea898273abe51fc4ca776ce51f319e7f790ec22dcdf534d880fc9527c6c5cd3f6074"

RPROVIDES:${PN} += "libbpf-devel-static"

RDEPENDS:${PN} += "libbpf-devel \
libbpf1"

inherit rpm
