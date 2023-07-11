SUMMARY = "Development files for Persistent Memory pool management library"
DESCRIPTION = "The libpmempool library provides a set of utilities for off-line administration, \
analysis, diagnostics and repair of persistent memory pools created \
by libpmemlog, libpemblk and libpmemobj libraries."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "libpmempool-devel-1.11.1-1.9.aarch64.rpm"
RPM_HASH = "479fe1a8915ada1e0bcfe52f9a42b022941bfa6816d9ccf515792567ecf96593adf236724b8df87e93b7fe7b998aab7b5ca39ced1bdc9043b0d5888cc4affafe"

RPROVIDES:${PN} += "libpmempool-devel \
pkgconfig-libpmempool"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdaxctl.so.1 \
libndctl.so.6 \
libpmem.so.1 \
libpmempool1 \
pkgconfig-libdaxctl \
pkgconfig-libndctl \
pkgconfig-libpmem"

inherit rpm
