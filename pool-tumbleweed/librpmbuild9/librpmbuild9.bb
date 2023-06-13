SUMMARY = "Library for building RPM packages"
DESCRIPTION = "Thie package contains a library with functions for building RPM packages."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "librpmbuild9-4.18.0-5.1.aarch64.rpm"
RPM_HASH = "a52e88f10e7f1125450561a07f246e925acbec043a5b1d6dee3bd60ca956bf3bfe17e3952cd839736d7452ca5e7123e509f36739eafe2d64522fa9746ed347b8"

RPROVIDES:${PN} += "librpmbuild.so.9()(64bit) \
librpmbuild9 \
librpmbuild9(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libcap.so.2()(64bit) \
libdw.so.1()(64bit) \
libdw.so.1(ELFUTILS_0.159)(64bit) \
libdw.so.1(ELFUTILS_0.177)(64bit) \
libelf.so.1()(64bit) \
libelf.so.1(ELFUTILS_1.0)(64bit) \
libelf.so.1(ELFUTILS_1.5)(64bit) \
libgomp.so.1()(64bit) \
libgomp.so.1(GOMP_1.0)(64bit) \
libgomp.so.1(GOMP_2.0)(64bit) \
libgomp.so.1(GOMP_4.0)(64bit) \
libgomp.so.1(OMP_1.0)(64bit) \
liblua5.4.so.5()(64bit) \
libmagic.so.1()(64bit) \
libpopt.so.0()(64bit) \
libpopt.so.0(LIBPOPT_0)(64bit) \
librpm.so.9()(64bit) \
librpmio.so.9()(64bit)"

inherit rpm
