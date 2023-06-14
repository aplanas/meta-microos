SUMMARY = "Library for building RPM packages"
DESCRIPTION = "Thie package contains a library with functions for building RPM packages."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "librpmbuild9-4.18.0-5.1.aarch64.rpm"
RPM_HASH = "a52e88f10e7f1125450561a07f246e925acbec043a5b1d6dee3bd60ca956bf3bfe17e3952cd839736d7452ca5e7123e509f36739eafe2d64522fa9746ed347b8"

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
