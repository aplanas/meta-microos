SUMMARY = "High-Performance Asynchronous HTTP Client Library"
DESCRIPTION = "The serf library is a C-based HTTP client library built upon the Apache \
Portable Runtime (APR) library. It multiplexes connections, running the \
read/write communication asynchronously. Memory copies and transformations are \
kept to a minimum to provide high performance operation."
LICENSE = "Apache-2.0"

PV = "1.3.10"

RPM_NAME = "libserf-devel-1.3.10-1.1.aarch64.rpm"
RPM_HASH = "154b10f787937d85789c03a3536ed650e0240d65564017b5a0a7198def8b7afff2ff9e7ba6daecbaa346bb200ef86eec55779f79637f6b6d3605de51dc7804c8"

RPROVIDES:${PN} += "libserf-devel \
libserf-devel(aarch-64) \
pkgconfig(serf-1)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libserf-1-1 \
pkgconfig(libcrypto) \
pkgconfig(libssl)"

inherit rpm
