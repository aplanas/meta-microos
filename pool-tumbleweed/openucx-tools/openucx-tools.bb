SUMMARY = "OpenUCX utilities"
DESCRIPTION = "Miscallaneous utilities for Unified Communication X."
LICENSE = "BSD-3-Clause"

PV = "1.14.0"

RPM_NAME = "openucx-tools-1.14.0-1.1.aarch64.rpm"
RPM_HASH = "dc60dc4be6d7564c94c8346920578d010540b7b1a2e84c9b49785f1ac6d99da7c733a276f19f310a317d5fa5e2710e4454b483cf2ba3ef77892bd1b7a6d46e7c"

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
