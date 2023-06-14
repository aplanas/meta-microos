SUMMARY = "Libmms development files"
DESCRIPTION = "Headers and libraries to program against libmms"
LICENSE = "LGPL-2.1+"

PV = "0.6.4"

RPM_NAME = "libmms-devel-0.6.4-5.26.aarch64.rpm"
RPM_HASH = "eb4fda52b70cccf1d2e8c052a81dbb2c3d127d696025eafcc025f334246d6db58ff81467a32510778be872362e1af4fcc4298fa7bf2f1724a368412d14f0405b"

RPROVIDES:${PN} += "libmms-devel \
pkgconfig-libmms"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libmms0"

inherit rpm
