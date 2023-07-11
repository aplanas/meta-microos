SUMMARY = "Library for building RPM packages"
DESCRIPTION = "Thie package contains a library with functions for building RPM packages."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "librpmbuild9-4.18.0-5.3.aarch64.rpm"
RPM_HASH = "fe6a6d517d4705fc608177b6b2b0c74b1c025184b7fe793a8e27c86a8de176d274e479f1958b5fe0f4bd980bf2ef10d933e5a43db90157282c1443f9f4779d80"

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
