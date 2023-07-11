SUMMARY = "A small library for fetching information from DeltaRPM packages"
DESCRIPTION = "This package provides a small library allowing one to fetch \
information from DeltaRPM packages."
LICENSE = "LGPL-2.1-or-later"

PV = "0.5.1"

RPM_NAME = "libdrpm0-0.5.1-1.5.aarch64.rpm"
RPM_HASH = "16205c24e333cb4b9c0fd5a5b65f138923a3e5fbd1f3407843bd78a4bd80251724cb3b82c86e82d9ea6104ceb06411da064b2690ac53d0ca7ecd77afbf4b1f7e"

RPROVIDES:${PN} += "libdrpm.so.0 \
libdrpm0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libcrypto.so.3 \
liblzma.so.5 \
librpm.so.9 \
librpmio.so.9 \
libz.so.1 \
libzstd.so.1"

inherit rpm
