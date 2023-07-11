SUMMARY = "Static library for libbpf"
DESCRIPTION = "libbpf is a C library which provides API for managing eBPF programs and maps."
LICENSE = "LGPL-2.1-only"

PV = "1.2.0"

RPM_NAME = "libbpf-devel-static-1.2.0-1.2.aarch64.rpm"
RPM_HASH = "0195a38c86c4f561723b7f2e4df31c7663027726bf68606680b8bdca3cea9e7942f88929dc2d5e21eabadc82e26c6e7299bc0b154bce695a07c0351850670126"

RPROVIDES:${PN} += "libbpf-devel-static"

RDEPENDS:${PN} += "libbpf-devel \
libbpf1"

inherit rpm
