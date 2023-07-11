SUMMARY = "OpenUCX utilities"
DESCRIPTION = "Miscallaneous utilities for Unified Communication X."
LICENSE = "BSD-3-Clause"

PV = "1.14.0"

RPM_NAME = "openucx-tools-1.14.0-1.2.aarch64.rpm"
RPM_HASH = "d1d2f49d44790d2efcd8a547b792138de7ec757b6c25dd68ae75fb6422e0cdc04c428ea441d09d6d86d485ed06be5a1817fa0da66fb05d1e2cc6b03ee1da792c"

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
