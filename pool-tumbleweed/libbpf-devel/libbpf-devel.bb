SUMMARY = "Development files for libbpf"
DESCRIPTION = "libbpf is a C library which provides API for managing eBPF programs and maps."
LICENSE = "LGPL-2.1-only"

PV = "1.2.2"

RPM_NAME = "libbpf-devel-1.2.2-1.1.aarch64.rpm"
RPM_HASH = "08298b4ead2e3487546356e1a14dbc36e9bd6ee1f36482cef8c434fd29c7563ad293276063af10902f0027d941fe2ab324201aa891363868f0efa34529c9ab9c"

RPROVIDES:${PN} += "libbpf-devel \
pkgconfig-libbpf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbpf1 \
pkgconfig-libelf \
pkgconfig-zlib"

inherit rpm
