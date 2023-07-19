SUMMARY = "Static library for libbpf"
DESCRIPTION = "libbpf is a C library which provides API for managing eBPF programs and maps."
LICENSE = "LGPL-2.1-only"

PV = "1.2.2"

RPM_NAME = "libbpf-devel-static-1.2.2-1.1.aarch64.rpm"
RPM_HASH = "067464d1f158f853be982a334550a9206c22c8528c0bb373d4b9f5512a1979cbb93bafdc66b7e2a66124300046bc16d0ab2cc78ded013e8c91c32e78854b6b57"

RPROVIDES:${PN} += "libbpf-devel-static"

RDEPENDS:${PN} += "libbpf-devel \
libbpf1"

inherit rpm
