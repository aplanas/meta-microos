SUMMARY = "OpenUCX utilities"
DESCRIPTION = "Miscallaneous utilities for Unified Communication X."
LICENSE = "BSD-3-Clause"

PV = "1.14.1"

RPM_NAME = "openucx-tools-1.14.1-1.1.aarch64.rpm"
RPM_HASH = "5cff6db6ef977e56651650e7ff099ff3d02917ce440dd4dce0c80524609b14d2835681e1e6cf91a277ab8178928de3f458b1cebf33465b2eaeb2f2fd81cfe770"

RPROVIDES:${PN} += "openucx-tools \
pkgconfig-ucx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libstdc++.so.6 \
libucp.so.0 \
libucs.so.0 \
libuct.so.0 \
pkgconfig-ucx-ucs \
pkgconfig-ucx-uct"

inherit rpm
