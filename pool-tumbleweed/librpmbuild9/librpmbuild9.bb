SUMMARY = "Library for building RPM packages"
DESCRIPTION = "Thie package contains a library with functions for building RPM packages."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "librpmbuild9-4.18.0-6.1.aarch64.rpm"
RPM_HASH = "b3926c4963d9004bf08dca45f6b114f2347f3a4a66131cc395b35fc9ced39e7c719a0edcb9a0e8c6ebc54f2949abba702c12e00c1544a6328e34418a1b39030a"

RPROVIDES:${PN} += "librpmbuild.so.9 \
librpmbuild9"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libdw.so.1 \
libelf.so.1 \
libgomp.so.1 \
liblua5.4.so.5 \
libmagic.so.1 \
libpopt.so.0 \
librpm.so.9 \
librpmio.so.9"

inherit rpm
