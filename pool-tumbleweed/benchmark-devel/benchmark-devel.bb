SUMMARY = "Development files for google benchmark"
DESCRIPTION = "Development files for google benchmark library"
LICENSE = "Apache-2.0"

PV = "1.7.1"

RPM_NAME = "benchmark-devel-1.7.1-1.4.aarch64.rpm"
RPM_HASH = "b22e874e9fd958b85dc41b60b511eee1c2a08fdc14bceaac53dd6bf85555ba5e9af7b7658a875f9f40c5fa3f18174fe3158834594a807940b244f0e83e9a2380"

RPROVIDES:${PN} += "benchmark-devel \
cmake-benchmark \
pkgconfig-benchmark"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbenchmark1"

inherit rpm
