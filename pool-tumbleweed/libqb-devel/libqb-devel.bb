SUMMARY = "Development files for libqb"
DESCRIPTION = "libqb is a library providing high performance client server reusable \
features. It provides logging, tracing, IPC, and polling."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.7+20230607.06c8641"

RPM_NAME = "libqb-devel-2.0.7+20230607.06c8641-1.1.aarch64.rpm"
RPM_HASH = "a2d483a848f2ed59fd083ebb1ef9c7e21535ff9f4350aa25236e051aa8db9cc810568bbb5684e81bb11974ca539cfccac25f777fea9777d21c0cb9e81f2478d4"

RPROVIDES:${PN} += "libqb-devel \
pkgconfig-libqb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libqb100"

inherit rpm
